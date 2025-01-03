document.addEventListener("DOMContentLoaded", () => {
    // Dodaj klasę zoom-in po załadowaniu strony
    document.body.classList.add("zoom-in");

    // Dodaj listener na wszystkie linki
    const links = document.querySelectorAll("a");
    links.forEach(link => {
        link.addEventListener("click", (e) => {
            const href = link.getAttribute("href");
            if (href && !href.startsWith("#")) {
                e.preventDefault();
                document.body.classList.add("zoom-out");
                setTimeout(() => {
                    window.location.href = href;
                }, 700); // Czas musi pasować do animacji zoomOut
            }
        });
    });
});
