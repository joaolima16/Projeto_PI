var itens = [1];
var quantityItens = [];
var totalPrice = 0;
var tPrice;
itens = JSON.parse(localStorage.getItem("produtos"));

function renderizarProdutos() {
  var container = document.querySelector(".itens-container");
  container.innerHTML = "";
  itens.forEach((item, index) => {
    quantityItens[index] = 1;
    container.innerHTML += `
    <tr>
      <td>
        <div class="product">
          <img class="img" src="${item.imgUrl}" alt="" />
          <div class="info">
            <div class="name">${item.name}</div>
            <div class="category">${item.category}</div>
        </div>
      </div>
    </td>
    <td>R$ ${item.price}</td>
    <td>
      <div class="qty">
        <button onclick="decrementCount(${index})"><i class="bx bx-minus"></i></button>
        <span class="quantity">${quantityItens[index]}</span>
        <button class="btn_quantity" onclick="incrementCount(${index})"><i class="bx bx-plus"></i></button>
      </div>
    </td>
    <td>R$ ${item.price * quantityItens[index]}</td>
    <td>
      <button class="remove" onclick="removeItem(${index})"><i class="bx bx-x"></i></button>
    </td>
  </tr>
    `;
  });
  calculateTotalPriceItems();
}

function recarregarProdutos() {
  var container = document.querySelector(".itens-container");
  container.innerHTML = "";
  itens.forEach((item, index) => {
    container.innerHTML += `
    <tr>
      <td>
        <div class="product">
          <img class="img" src="${item.imgUrl}" alt="" />
          <div class="info">
            <div class="name">${item.name}</div>
            <div class="category">${item.category}</div>
        </div>
      </div>
    </td>
    <td>R$ ${item.price}</td>
    <td>
      <div class="qty">
        <button onclick="decrementCount(${index})"><i class="bx bx-minus"></i></button>
        <span class="quantity">${quantityItens[index]}</span>
        <button class="btn_quantity" onclick="incrementCount(${index})"><i class="bx bx-plus"></i></button>
      </div>
    </td>
    <td>R$ ${item.price * quantityItens[index]}</td>
    <td>
      <button class="remove" onclick="removeItem(${index})"><i class="bx bx-x"></i></button>
    </td>
  </tr>
    `;
  });
  calculateTotalPriceItems();
}

const calculateTotalPriceItems = () => {
  const containerDivPrice = document.querySelector(".totalPrice");
  let totalPrice = itens.reduce((total, item, index) => {
    return total + item.price * quantityItens[index];
  }, 0);
  tPrice = totalPrice.toLocaleString("pt-BR", {
    style: "currency",
    currency: "BRL"
  })
  containerDivPrice.innerHTML = `${totalPrice.toLocaleString("pt-BR", {
    style: "currency",
    currency: "BRL",
  })}`;

};

const decrementCount = (position) => {
  if (quantityItens[position] > 1) {
    quantityItens[position] = quantityItens[position] - 1;
    totalPrice = 0;
    recarregarProdutos();
  }
};
const incrementCount = (position) => {
  if (quantityItens[position] >= 1) {
    quantityItens[position] = quantityItens[position] + 1;
    totalPrice = 0;
    recarregarProdutos();
  }
};
const removeItem = (position) => {
  if (itens.length > 0) {
    itens.splice(position, 1);
    totalPrice = 0;

    recarregarProdutos();
  } else {
    var containerDivPrice = document.querySelector(".totalPrice");
    containerDivPrice.innerHTML = "R$ 0";
  }
};
const finalizarCompra = () =>{
  var body = document.querySelector("#body");

  body.innerHTML = `
  <p class="informations">Total de itens: ${itens.length}</p>
   <p class="informations">Total da compra: ${tPrice}</p>

  `
}