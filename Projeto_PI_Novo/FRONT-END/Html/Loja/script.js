let navbar = document.querySelector(".navbar");
document.querySelector("#menu-btn").onclick = () => {
  navbar.classList.toggle("active");
  seachForm.classList.remove("active");
  cartItem.classList.remove("active");
};

let seachForm = document.querySelector(".search-form");
document.querySelector("#search-btn").onclick = () => {
  seachForm.classList.toggle("active");
  navbar.classList.remove("active");
  cartItem.classList.remove("active");
};

let cartItem = document.querySelector(".cart-items-container");
document.querySelector("#cart-btn").onclick = () => {
  cartItem.classList.toggle("active");
  navbar.classList.remove("active");
  seachForm.classList.remove("active");
};

window.onscroll = () => {
  navbar.classList.remove("active");
  seachForm.classList.remove("active");
  cartItem.classList.remove("active");
};


var itensCart = [];
let count = 1;

document.getElementById("radio1").checked = true;

setInterval( function(){
    nextImage();
}, 5000)

function nextImage(){
    count++;
    if(count>4){
        count = 1;
    }

    document.getElementById("radio" + count).checked = true;

}
async function carregarProdutos(){
    const divContainer = document.getElementById("box-container");
    const divSecondaryProducts = document.getElementById("box_bestProducts");
    let arrProducts = [];
    var url = "http://localhost:8080/product"
    await fetch(url)
        .then((response) => response.json())
        .then((res) => arrProducts = res)
        .catch((error) => console.log(error))

    arrProducts.map(({name, imgUrl, price, id})=>{
      
        divContainer.innerHTML += `
        <div class="box">
            <h3>${name}</h3>
            <a href="../DetalheProduto/detalhes.html?id=${id}" target="_blank"><img src="${imgUrl}" alt="" class="img_products"></a>
            <div class="price">R$ ${price}</div>
            <a key="${id}"href="#" class="btn" onclick="adicionarAoCarrinho(${id})"> ADICIONAR AO CARRINHO</a>
        </div>
        `
    })
    for(var i = 0; i < 3; i++){
        divSecondaryProducts.innerHTML += `
        <div class="box">

        <div class="icons">

        <a href="../DetalheProduto/detalhes.html?id=${arrProducts[i]?.id}"  target="_blank" class="fas fa-eye"></a>
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
async function adicionarAoCarrinho(id){
    
    var url = `http://localhost:8080/product/${id}`
    await fetch(url)
        .then((res) => res.json())
        .then((response) =>{
            itensCart.push(response)
            recarregarCarrinho(response);
        
        })
        .catch((err) => {console.error(err)})
}

async function removerDoCarrinho(id){
    itensCart.forEach((index) =>{
        var cont = 0;
        if(index.id == id){
           itensCart.splice(cont, 1);
           recarregarCarrinho();
        }
        cont++;
    })
}
async function recarregarCarrinho(){
    var divList = document.querySelector(".cart-items-container")
    divList.innerHTML  ="" ;
    itensCart.forEach((item)=>{
        divList.innerHTML +=`
        <div class="cart-item">
        <span class="fas fa-times" onclick="removerDoCarrinho(${item.id})"></span>
     
        <div class="content">
            <h3>${item.name} </h3>
            <div class="price"> R$ ${item.price}</div>
        </div>
        </div>
        `
 
    })
    divList.innerHTML +=  `<a class="btn" onclick="redirecionar()"> Finalizar Carrinho </a> </a>`
}
async function redirecionar(){
    var json = JSON.stringify(itensCart)
    localStorage.setItem("produtos",json)
    window.location.href = `../Carrinho/Carrinho.html?array=${json}`
}