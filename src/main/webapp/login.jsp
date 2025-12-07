<!DOCTYPE html>
<html>
<head>
    <title>Admin Login | ChildGuard</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="container small-container">
    <h2 style="text-align:center;">Admin Login</h2>

    <% if (request.getParameter("error") != null) { %>
        <div class="alert error"> Incorrect username or password.</div>
    <% } %>

    <form action="LoginServlet" method="post" class="form-box">
        <label>Username</label>
        <input type="text" name="username" required>

        <label>Password</label>
        <input type="password" name="password" required>

        <button type="submit" class="btn" style="width:100%;">Login</button>
    </form>

    <p style="text-align:center; margin-top:20px;">
        <a href="DashboardServlet" class="btn">View Reports</a>
    </p>
</div>

<!-- Footer -->
<footer class="footer">
    <h3>Support & Reference Links</h3>
    <ul class="footer-links">
        <li><a href="https://www.unicef.org/reports" target="_blank">UNICEF Reports</a></li>
        <li><a href="https://labour.gov.in/childlabour" target="_blank">Government Acts & Labour Laws</a></li>
        <li><a href="https://www.savethechildren.in/resource-centre/" target="_blank">NGO Publications</a></li>
        <li><a href="https://www.statista.com/topics/child-labour-india/" target="_blank">Child Labour Data - India</a></li>
        <li><a href="https://en.wikipedia.org/wiki/Child_labour_in_India" target="_blank">Wikipedia - Child Labour in India</a></li>
        <li><a href="https://labour.gov.in/hi/childlabour/about-child-labour" target="_blank">Ministry of Labour - Child Labour</a></li>
        <li><a href="https://indiancc.mygov.in/activity/anushreewaghmare/child-labour/" target="_blank">
            MyGov - Child Labour Initiative</a></li>
    </ul>
    <p class="copytext">JSPM © 2025 ChildGuard - Protecting Children, Empowering Communities.</p>
</footer>

</body>
</html>
