function formatarCPF() {
    const cpf = document.querySelector("#cpf")
    let inputLength = cpf.value.length;
    if (inputLength === 3 || inputLength === 7) {
        cpf.value += ".";
    }
    else if (inputLength === 11) {
        cpf.value += "-";
    }
}
function formatarCEP() {
    const cep = document.querySelector('#cep');

    let inputLength = cep.value.length

    if (inputLength === 5) {
        cep.value += "-"
    }
}

function buscarCEP() {
    const cep = document.querySelector('#cep');
    var url = `https://viacep.com.br/ws/${cep.value}/json/`
    fetch(url)
        .then((res) => res.json())
        .then(({ bairro, logradouro, uf }) => {
            if (bairro === undefined) {
                alert("CEP invalido")
                document.querySelector("#cep").value = "";
            }
            else {
                document.querySelector("#bairro").value = bairro
                document.querySelector("#rua").value = logradouro
                document.querySelector("#uf").value = uf
            }

        })
        .catch((error) => {
            alert("Ocorreu um erro ao buscar o cep")
            console.log(error)
        })
}
function validarCampos(event) {
    event.preventDefault();
    const nome = document.getElementById("nome").value;
    const cpf = document.getElementById("cpf").value;
    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;
    const bairro = document.getElementById("bairro").value;
    const rua = document.getElementById("rua");


    if (nome.trim() === "" || email.trim() === "" || cpf.trim() === "" || senha.trim() === "") {
        alert("Preencha os campos nome, email, senha e cpf!");
    }
    else {
        cadastrarUsuario();
    }
}
const cadastrarUsuario = () => {
    const url = "http://localhost:8080/user"

    const nome = document.getElementById("nome");
    const cpf = document.getElementById("cpf");
    const email = document.getElementById("email");
    const senha = document.getElementById("senha");
    const genero = document.getElementById("genero")
    const bairro = document.getElementById("bairro");
    const rua = document.getElementById("rua");
    const uf = document.getElementById("uf");

    const json = JSON.stringify({
        name: nome.value,
        cpf: cpf.value,
        email: email.value,
        password: senha.value,
        gender: "M",
        id_address: {
            neighborhood: bairro.value,
            street: rua.value,
            uf: uf.value
        }
    })
    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: json
    })
        .then((response) => {
            if (response.ok) {
                alert("Usuário cadastrado com sucesso!");
                window.location.replace("../index.html");

            }
            else {
                alert("Ocorreu um erro ao cadastrar o usuário")
            }
            response.json()
        })
        .catch((error) => {
            alert("Ocorreu um erro ao cadastrar o usuário")
            console.log(error)
        })
}
