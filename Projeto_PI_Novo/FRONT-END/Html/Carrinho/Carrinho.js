function carregarProdutos(){
  var container = document.querySelector(".itens-container")
  var itens = [];
  itens = JSON.parse(localStorage.getItem("produtos"))

  for(var i = 0; i < itens.length; i++){
    
    container.innerHTML += `
    <tr>
      <td>
        <div class="product">
          <img class="img" src="${itens[i].imgUrl}" alt="" />
          <div class="info">
            <div class="name">${itens[i].name}</div>
            <div class="category">${itens[i].category}</div>
        </div>
      </div>
    </td>
    <td>R$ ${itens[i].price}</td>
    <td>
      <div class="qty">
        <button><i class="bx bx-minus"></i></button>
        <span>2</span>
        <button><i class="bx bx-plus"></i></button>
      </div>
    </td>
    <td>R$ ${itens[i].price}</td>
    <td>
      <button class="remove"><i class="bx bx-x"></i></button>
    </td>
  </tr>
    
    
    `
  }
}
const decrementQuantity =  () =>{


}