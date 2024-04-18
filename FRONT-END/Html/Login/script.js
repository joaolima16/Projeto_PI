function validarCampos(event){
    event.preventDefault();

    let email = document.getElementById("email").value;
    let senha = document.getElementById("senha").value;

    if(email.trim() === "" || senha.trim() === ""){
        alert("Favor prencher todos os campos!");
    }
    else{
        loginUsuario();
    }
}


function loginUsuario(){
    const url = "http://localhost:8080/user/login"
    let email = document.getElementById("email").value;
    let senha = document.getElementById("senha").value;
    const json = JSON.stringify({
        email: email, 
        password: senha
    })
    fetch(url, {
        method: 'POST',
        headers: {  'Content-Type': 'application/json',},
        body: json
    })
    .then((response) =>{
        if(response.ok){
            alert("Usuário logado!");
            window.location.href = "../index.html";
        }
        else{
            alert("Login incorreto!");
        }
    })
    .catch((error) =>{
        alert("Ocorreu um erro ao logar")
        console.log(error)
    })

}