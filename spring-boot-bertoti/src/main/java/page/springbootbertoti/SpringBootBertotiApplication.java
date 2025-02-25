package page.springbootbertoti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@SpringBootApplication
@RestController
public class SpringBootBertotiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBertotiApplication.class, args);
    }
}

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pokemons")
class RestApiDemoController {
    private List<Pokemon> pokemons = new ArrayList<>();

    public RestApiDemoController() {
        pokemons.addAll(List.of(
                new Pokemon("Charmander", "Fire"),
                new Pokemon("Squirtle", "Water"),
                new Pokemon("Bulbasaur", "Plant")
        ));
    }

    @GetMapping
    Iterable<Pokemon> getPokemons() {
        return pokemons;
    }

    @GetMapping("/{id}")
    Optional<Pokemon> getPokemonById(@PathVariable String id) {
        return pokemons.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @PostMapping
    Pokemon postPokemon(@RequestBody Pokemon pokemon) {
        Pokemon novoPokemon = new Pokemon(pokemon.getName(), pokemon.getType());
        pokemons.add(novoPokemon);
        return novoPokemon;
    }

    @PutMapping("/{id}")
    ResponseEntity<Pokemon> putPokemon(@PathVariable String id, @RequestBody Pokemon pokemon) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getId().equals(id)) {
                pokemons.get(i).setName(pokemon.getName());
                pokemons.get(i).setType(pokemon.getType());
                return new ResponseEntity<>(pokemons.get(i), HttpStatus.OK);
            }
        }

        // Se não existir, criamos um novo Pokémon com ID gerado automaticamente
        Pokemon novoPokemon = new Pokemon(pokemon.getName(), pokemon.getType());
        pokemons.add(novoPokemon);
        return new ResponseEntity<>(novoPokemon, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deletePokemon(@PathVariable String id) {
        boolean removed = pokemons.removeIf(p -> p.getId().equals(id));

        return removed ?
                new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
