<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="index.jsp">Desserts Japonais</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
        aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ${pagina.endsWith('Carte') ? 'active' : ''}">
                <a class="nav-link" href="ServletCarte">Notre carte <span class="sr-only">(current)</span></a>
            </li>
            <c:if test="${not empty client}">
                <li class="nav-item ${pagina.endsWith('Commande') ? 'active' : ''}">
                    <a class="nav-link" href="ServletPanierCommande">Passer commande</a>
                </li>
            </c:if>
            <li class="nav-item ${pagina.endsWith('Contact') ? 'active' : ''}">
                <a class="nav-link" href="ServletContact">Contact</a>
            </li>
        </ul>
        <ul class="navbar-nav navbar-right">
            <c:if test="${empty client}">
                <li class="nav-item ${pagina.endsWith('Inscription') ? 'active' : ''}">
                    <a class="nav-link" href="ServletInscription">Inscription</a>
                </li>
                <li class="nav-item ${pagina.endsWith('Login') ? 'active' : ''}">
                    <a class="nav-link" href="ServletLogin">Login</a>
                </li>
            </c:if>

            <c:if test="${not empty client}">
            <!-- <form method="GET" action="ServletLogOut"> -->
                <li class="nav-item">
                    <a class="nav-link" href="ServletLogOut">Logout</a>
                </li>
              <!-- </form> -->
            </c:if>

        </ul>
    </div>
</nav>
