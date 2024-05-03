async function carregarProdutos(){
    const divContainer = document.getElementById("box-container");
    const divSecondaryProducts = document.getElementById("box_bestProducts");
    let arrProducts = [];
    var url = "http://localhost:8080/product"
    await fetch(url)
        .then((response) => response.json())
        .then((res) => arrProducts = res)
        .catch((error) => console.log(error))

    arrProducts.map(({id, name, price, imgUrl})=>{
        divContainer.innerHTML += `
        <div class="box">
            <h3>${name}</h3>
            <img src="${imgUrl}" alt="" class="img_products">
            <div class="price">R$ ${price}</div>
            <a key="${id}"href="#" class="btn"> ADQUIRE</a>
        </div>
        `
    })
    for(var i = 0; i < 3; i++){
        divSecondaryProducts.innerHTML += `
        <div class="box">

        <div class="icons">
            <a href="#" class="fas fa-shopping-cart"></a>
            <a href="#" class="fas fa-heart"></a>
            <a href="#" class="fas fa-eye"></a>
        </div>
        <div class="imagens">
            <img src="${arrProducts[i].imgUrl}" alt="">
        </div>
        <div class="content">
            <h3>${arrProducts[i].name}</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star-half-alt"></i>
            </div>

                <div class="price">${arrProducts[i].price}R$ </div>
            </div>
        </div>
        
        `
    }

}