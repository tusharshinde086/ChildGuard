// Smooth fade-out effect for alerts
setTimeout(() => {
    let alerts = document.querySelectorAll(".alert");
    alerts.forEach(a => {
        a.style.opacity = "0";
        setTimeout(() => a.remove(), 600);
    });
}, 3000);

// Toggle sidebar/menu (optional future use)
function toggleMenu() {
    let sidebar = document.getElementById("sidebar");
    sidebar.classList.toggle("open");
}

// Confirm delete popup
function confirmDelete() {
    return confirm("Are you sure you want to delete this report?");
}
