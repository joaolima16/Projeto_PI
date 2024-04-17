function formatarCEP(){
    var input = document.querySelector("#cep");
    var cep = input.value.replace(/\D/g, '');

    if (cep.length > 5) {
      cep = cep.substring(0, 5) + '-' + cep.substring(5);
    }

    input.value = cep;
}
const buscarCEP = () =>{
    var cep = document.querySelector("#cep").value
    var url = `viacep.com.br/ws/${cep}/json/`
    console.log(cep);
    console.log("teste")
}