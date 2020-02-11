<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Desserts Japonais</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
          integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
          crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
          integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
          crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
          integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
          crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
        integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
  <link rel="stylesheet" href="css/style-parallax.css">
</head>

<body>
<%@ include file="nav.jsp" %>

<div class="pimg1">
  <div class="ptext">
      <span class="my-border">
        Desserts Japonais
      </span>
  </div>
</div>



<section class="section section-dark">
  <h2> 人気のレシピ</h2>
  <div class="container">
    <div class="row">
      <div class="col d-flex align-items-stretch">
        <div class="card" style="width: 500px;">
          <img class="card-img-top" src="img/taiyaki.jpg" alt="Card image" style="width:100%">
          <div class="card-body">
            <h4 class="card-title">たい焼き (Taiyaki)</h4>
            <p class="card-text">Le taiyaki est un gâteau japonais en forme de poisson.
              La plupart du temps, il est
              fourré d'anko, une pâte de haricots rouges sucrés. D'autres garnitures possibles incluent la crème
              pâtissière, la crème au chocolat et la crème au fromage. Le taiyaki est fabriqué en utilisant la pâte à
              pancake ou à gaufres.
            </p>
          </div>
          <div class=".card-footer recette-footer">
            <h5>Difficulté</h5>
            <div class="progress progress-margin">
              <div class="progress-bar bg-red progress-bar-striped" style="width:70%">70%</div>
            </div>
            <a href="#" class="btn btn-dark">Voir recette</a>
          </div>
        </div>
      </div>
      <div class="col d-flex align-items-stretch">
        <div class="card" style="width: 500px;">
          <img class="card-img-top" src="img/anpan.jpg" alt="Card image" style="width:100%">
          <div class="card-body">
            <h4 class="card-title">あんぱん (Anpan)</h4>
            <p class="card-text">L’anpan est une viennoiserie japonaise fourrée au anko, une pâte de haricots rouges
              sucrés. Il y a de nombreux types d'anpan, dont goma an, shiro an, uguisu an, kuri an, mais l'authentique
              anpan est fait avec l’anko de haricot azuki.
            </p>

          </div>
          <div class=".card-footer recette-footer">
            <h5>Difficulté</h5>
            <div class="progress progress-margin">
              <div class="progress-bar bg-red progress-bar-striped" style="width:30%">30%</div>
            </div>
            <a href="#" class="btn btn-dark">Voir recette</a>
          </div>
        </div>
      </div>
    </div>

  </div>
</section>

<div class="pimg2">
  <div class="ptext">
      <span class="my-border trans">
        Délice de mochi au cacao et son trésor de fraise
      </span>
  </div>
</div>

<section class="section section-dark">
  <h2>チーム</h2>
  <div class="row">
    <div class="col">
      <div class="row">
        <img src="img/equipe1.jpg" class="rounded-circle mx-auto d-block" alt="photo de Mr Tanaka" width="300"
             height="300">
      </div>
      <div class="row">
        <h3 class="mx-auto equipe">松久 信幸</h3>
      </div>
      <div class="row mx-auto" style="width: 75%;">
        Nobuyuki "Nobu" Matsuhisa est un grand chef cuisinier et restaurateur connu pour sa cuisine fusion
        mêlant les plats de la cuisine traditionnelle japonaise et les ingrédients de l'Amérique du Sud et du Milieu
        ainsi que du Nord.
      </div>
      <div class="row mx-auto lieu" style="width: 25%;">
        <i class="fas fa-map-marker-alt"></i> 大阪市 ŌSAKA
      </div>
    </div>
    <div class="col">
      <div class="row">
        <img src="img/equipe2.jpg" class="rounded-circle mx-auto d-block" alt="photo de Mr Tanaka" width="300"
             height="300">
      </div>
      <div class="row">
        <h3 class="mx-auto equipe">近藤 麻理恵</h3>
      </div>
      <div class="row mx-auto" style="width: 75%;">
        Mari "Marie" Kondo est la muse de Nobuyuki Matsuhisa mais c'est aussi une des « mères » emblématiques des
        dorayaki japonais.
        Première promotion de chef à obtenir trois étoiles au Guide Michelin en 1933 de 1933 à 1968.
      </div>
      <div class="row mx-auto lieu" style="width: 25%;">
        <i class="fas fa-map-marker-alt"></i>京都市 KYŌTO
      </div>
    </div>

  </div>
</section>

<div class="pimg3">
  <div class="ptext">
      <span class="my-border trans">

        おいしい
      </span>
  </div>
</div>

<section class="section section-dark">
  <div class="container mt-3">
    <div class="media border p-3">
      <div class="media-body">
        <h4>
          ジョン・ドウ <small><i>
          2016年2月19日に投稿</i></small></h4>
        <p>
          上質で美味しい料理。クレメンタインとシナモンのデザートパイの特別な言及。非常に快適なサービス！美しい場所。</p>
      </div>
      <img src="img/girls2.jpg" alt="John Doe" class="ml-3 mt-3 rounded-circle" style="width:60px;height:65px">
    </div><br>
    <div class="media border p-3">
      <div class="media-body">
        <h4>
          アマンダ・ピーターソン <small><i>
          2019年12月24日に投稿</i></small></h4>
        <p>
          非常に美しい環境で、趣味良く装飾されています。優れたシェフによって昇華された洗練された料理。感覚の喜び。.</p>
      </div>
      <img src="img/woman.jpg" alt="John Doe" class="ml-3 mt-3 rounded-circle" style="width:60px;height:65px">
    </div>
  </div>
</section>

<div class="pimg4">
  <div class="ptext">
      <span class="my-border trans">
        Mutsumi Base
      </span>
  </div>
</div>

<section class="section section-dark">
  <h2>連絡先</h2>
  <p>
    私たちに連絡してメッセージを残す</p>
  <form>
    <div class="row">

      <div class="col-sm-4"><input type="text" class="form-control" id="nom" placeholder="ノム" name="name"></div>

      <div class="col-sm-8"><input type="text" class="form-control" id="email" placeholder="郵便物" name="email"></div>
    </div>

    <br>
    <div class="row">

      <textarea class="form-control" id="exampleFormControlTextarea1" placeholder="あなたのメッセージ" rows="2"></textarea>

      <div class="col"><br>
        <button type="submit" class="btn btn-red">参加する</button>
      </div>
    </div>

  </form>


  </div>
  </form>
  </div>
</section>

<div class="pimg1">
  <div class="ptext">
      <span class="my-border trans">
        御世話に成りました
      </span>
  </div>
</div>
</body>

</html>
