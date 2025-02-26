document.getElementById("addPokemon").addEventListener("click", async function() {
    const name = document.getElementById("pokemonName").value;
    const type1 = document.getElementById("pokemonType1").value;
    const type2 = document.getElementById("pokemonType2").value || null;

    const response = await fetch("http://localhost:8080/pokemons", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ name, type1, type2 })
    });

    if (response.ok) {
        alert("Pokémon adicionado!");
        carregarPokemons();
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

        let img1 = document.createElement("img");
        img1.src = `images/${(pokemon.type1).toLowerCase()}.png`;
        img1.alt = pokemon.type1;

        item.appendChild(img1);

        if (pokemon.type2) {
            let img2 = document.createElement("img");
            img2.src = `images/${(pokemon.type2).toLowerCase()}.png`;
            img2.alt = pokemon.type2;
            item.appendChild(img2);
        }

        let text = document.createElement("span");
        text.textContent = `${pokemon.name} - ${pokemon.type1} ${pokemon.type2 ? '/ ' + pokemon.type2 : ''}`;

        item.appendChild(text);
        lista.appendChild(item);
    });
}

carregarPokemons();
