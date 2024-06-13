// let navbar = document.querySelector(".navbar");
// document.querySelector("#menu-btn").onclick = () => {
//   navbar.classList.toggle("active");
//   seachForm.classList.remove("active");
//   cartItem.classList.remove("active");
// };

// let seachForm = document.querySelector(".search-form");
// document.querySelector("#search-btn").onclick = () => {
//   seachForm.classList.toggle("active");
//   navbar.classList.remove("active");
//   cartItem.classList.remove("active");
// };

// let cartItem = document.querySelector(".cart-items-container");
// document.querySelector("#cart-btn").onclick = () => {
//   cartItem.classList.toggle("active");
//   navbar.classList.remove("active");
//   seachForm.classList.remove("active");
// };

// window.onscroll = () => {
//   navbar.classList.remove("active");
//   seachForm.classList.remove("active");
//   cartItem.classList.remove("active");
// };


const loadProducts = async () => {
  var url = "http://localhost:8080/product";
  let arrProducts = [];
  let container_one = document.querySelector("#box-container_one");
  let container_two = document.querySelector("#box-container_two");
  let container_three = document.querySelector("#box-container_three");
  await fetch(url)
    .then((res) => res.json())
    .then((response) => (arrProducts = response))
    .catch((err) => console.log(err));

  
  for (var i = 0; i < arrProducts.length; i++) {
    if (i > 0 && i <= 3) {
      container_one.innerHTML += `
            <div class="box" >

                <img src="${arrProducts[i].imgUrl}" alt="">
                <h3>${arrProducts[i].name}</h3>
                <div class="price">${arrProducts[i].price}R$ <span> 8800.00$</span></div>
                <a href="DetalheProduto/detalhes.html?id=${arrProducts[i]?.id}" class="btn"> Visualizar</a>
            </div>
            `;
    } 
    else if (i > 3 && i <= 6) {
      container_two.innerHTML += `
        <div class="box" >
            <img src="${arrProducts[i].imgUrl}" alt="">
            <h3>${arrProducts[i].name}</h3>
            <div class="price">${arrProducts[i].price}R$ <span> 8800.00$</span></div>
            <a href="DetalheProduto/detalhes.html?id=${arrProducts[i]?.id}" class="btn"> Visualizar</a>
         </div> 
        `;
         
    } 
    else if(i > 6 && i <=9){
        container_three.innerHTML += `
        <div class="box" >
            <img src="${arrProducts[i].imgUrl}" alt="">
            <h3>${arrProducts[i].name}</h3>
            <div class="price">${arrProducts[i].price}R$ <span> 8800.00$</span></div>
            <a href="DetalheProduto/detalhes.html?id=${arrProducts[i]?.id}" target="_blank" class="btn"> Visualizar</a>
        </div> 
        
        `
    } 
  }
};
