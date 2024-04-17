const cpf = document.querySelector("#cpf");
function formatarCEP(){
  const cep =  document.querySelector('#cep');

  let inputLength = cep.value.length

  if(inputLength === 5 ){
    cep.value+= "-"
  }
}
function formatarCPF() {
  const cpf = document.querySelector("#cpf")
  let inputLength = cpf.value.length;
  if(inputLength === 3 || inputLength === 7){
    cpf.value +=".";
  }
  else if(inputLength === 11) {
    cpf.value +="-";
  }
}
function buscarCEP(){
  const cep =  document.querySelector('#cep');
  var url = `https://viacep.com.br/ws/${cep.value}/json/`
  fetch(url)
    .then((res) => res.json())
    .then(({bairro, logradouro, uf}) =>{
        if(bairro === undefined){
          alert("CEP invalido")
          document.querySelector("#cep").value = "";
        }
        else{
          document.querySelector("#bairro").value = bairro
          document.querySelector("#rua").value = logradouro
          document.querySelector("#uf").value = uf
        }
        
        })
      .catch((error) =>{
            alert("Ocorreu um erro ao buscar o cep")
            console.log(error)
  })
}
const cadastrarUsuario = () =>{
  const url = "http://localhost:8080/user"

  const nome = document.getElementById("nome");
  const cpf = document.getElementById("cpf");
  const email = document.getElementById("email");
  const senha = document.getElementById("senha");
  const genero = document.getElementById("genero")
  const bairro = document.getElementById("bairro");
  const numero = document.getElementById("numero");
  const rua = document.getElementById("rua");
  const uf = document.getElementById("uf");
  
  const json = JSON.stringify({
    name: nome.value,
    cpf: cpf.value,
    email: email.value,
    password: senha.value,
    gender: genero.value,
    id_address: {
      neighborhood: bairro.value,
      street: rua.value,
      uf: uf.value
    }
  })
  fetch(url,{
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: json
    })
    .then((response)=> response.json())
    .then((res)=>(console.log(res)))
    .catch((error)=>console.log(error))
}