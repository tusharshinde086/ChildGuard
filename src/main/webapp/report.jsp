<!DOCTYPE html>
<html>
<head>
    <title>Report Child Labour | ChildGuard</title>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/script.js"></script>
</head>

<body>

<!-- NAVBAR -->
<div class="navbar">
    <div>ChildGuard - Report Child Labour</div>
    <div><a href="index.jsp">Home</a></div>
</div>

<div class="container">

    <h2>Submit Child Labour Report</h2>

    <!-- Anonymous information box -->
    <div class="info-box">
        <strong>- Anonymous Reporting:</strong>  
        You do <u>not</u> need to provide your name. Your identity is fully protected.
    </div>

    <!-- Submission Success Message -->
    <% if (request.getParameter("success") != null) { %>
        <div class="alert success" id="successBox">
            - Your report has been submitted successfully!
        </div>
    <% } %>

    <!-- REPORT FORM CARD -->
    <div class="form-box">

        <form action="ReportServlet" method="post">

            <label>Report Title *</label>
            <input type="text" name="title" required placeholder="Example: Child working at a welding shop">

            <label>Location *</label>
            <input type="text" name="location" required placeholder="Enter exact area or address">

            <label>Description *</label>
            <textarea name="description" rows="5" required 
                placeholder="Describe what you saw: number of children, type of work, timings-"></textarea>

            <button type="submit" class="btn" style="margin-top: 10px;">Submit Report</button>

        </form>
    </div>

</div>

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

    <p class="copytext">JSPM 404© 2025 ChildGuard - Protecting Children, Empowering Communities.</p>
</footer>
</body>
</html>
