document.getElementById("addPokemon").addEventListener("click", async function() {
    const name = document.getElementById("pokemonName").value;
    const type = document.getElementById("pokemonType").value;

    const response = await fetch("http://localhost:8080/pokemons", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ name, type })
});

    if (response.ok) {
    alert("Pokémon adicionado!");
    carregarPokemons(); // Atualiza a lista na tela
} else {
    alert("Erro ao adicionar Pokémon!");
}
});

    async function carregarPokemons() {
    const response = await fetch("http://localhost:8080/pokemons");
    const pokemons = await response.json();

    let lista = document.getElementById("pokemonList");
    lista.innerHTML = "";
    pokemons.forEach(pokemon => {
    let item = document.createElement("li");
    item.textContent = `${pokemon.name} - ${pokemon.type}`;
    lista.appendChild(item);
});
}

carregarPokemons();
