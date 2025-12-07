<%@ page import="java.util.*, com.childguard.model.Report" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<Report> reports = (List<Report>) request.getAttribute("reports");
    if (reports == null) {
        response.sendRedirect("DashboardServlet");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Reports Dashboard | ChildGuard</title>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/script.js"></script>
</head>

<body>

<!-- NAVIGATION BAR -->
<div class="navbar">
    <div>ChildGuard – Admin Dashboard</div>
    <div>
        <a href="index.jsp">Home</a>
        <a href="login.jsp">Logout</a>
    </div>
</div>

<div class="container">
    <h2>Reports Dashboard</h2>

    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Location</th>
            <th>Description</th>
            <th>Status</th>
            <th>Date</th>
            <th>Actions</th>
        </tr>
        </thead>

        <tbody>
        <%
            for (Report r : reports) {
        %>

        <tr>
            <td><%= r.getId() %></td>
            <td><%= r.getTitle() %></td>
            <td><%= r.getLocation() %></td>
            <td><%= r.getDescription() %></td>
            <td><%= r.getStatus() %></td>
            <td><%= r.getDate() %></td>

            <td>
                <!-- UPDATE STATUS FORM -->
                <form method="post" action="DashboardServlet" style="display:inline;">
                    <input type="hidden" name="action" value="update">
                    <input type="hidden" name="id" value="<%= r.getId() %>">

                    <select name="status">
                        <option <%= r.getStatus().equals("Submitted") ? "selected" : "" %>>Submitted</option>
                        <option <%= r.getStatus().equals("Verified") ? "selected" : "" %>>Verified</option>
                        <option <%= r.getStatus().equals("Rescued") ? "selected" : "" %>>Rescued</option>
                        <option <%= r.getStatus().equals("Closed") ? "selected" : "" %>>Closed</option>
                    </select>

                    <button class="btn small" type="submit">Update</button>
                </form>

                <!-- DELETE FORM -->
                <form method="post" action="DashboardServlet"
                      style="display:inline;" 
                      onsubmit="return confirm('Are you sure you want to delete this report?');">

                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" name="id" value="<%= r.getId() %>">

                    <button class="btn small danger" type="submit">Delete</button>
                </form>
            </td>
        </tr>

        <% } %>
        </tbody>
    </table>

    <p><a href="index.jsp" class="btn">Back to Home</a></p>

</div>
<footer class="footer">
  
    <p class="copytext">© 2025 ChildGuard – Protecting Children, Empowering Communities.</p>
</footer>

</body>
</html>
