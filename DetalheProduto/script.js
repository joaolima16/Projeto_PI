async function loadProduct(){
    var url = "http://localhost:8080/product/1";
    await fetch(url)
            .then((res) => { res.json()})
            .then((response) => {console.log(response)})
            .catch((err) => { console.log(err)});
}