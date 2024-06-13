const loadPage = () =>{
    const urlParams = new URLSearchParams(window.location.search)
    const urlParam = urlParams.get("id");
    loadProduct(urlParam);
}


const loadProduct = async (id) => {
  let url = `http://localhost:8080/product/${id}`;
  let data;
  await fetch(url)
    .then((res) => res.json())
    .then((response) => (data = response))
    .catch((err) => console.log(err));

  document.querySelector(".name_product").innerHTML = `${data?.name}`;
  document.querySelector("#price").innerHTML = `R$ ${data?.price}`;
  document.querySelector(".description").innerHTML = `${data?.description}`;

  document.querySelector(".select-imagens").innerHTML += `
    <img src="${data?.imgUrl}" alt="${data?.name}">
    `;
    document.querySelector("#category").innerHTML = `Categoria: ${data?.category}`;

};
