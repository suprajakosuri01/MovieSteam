package Dev.SaiSupraja.MovieStream;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//in this class we will write database access methods
@Service

public class MovieService {
    @Autowired
    private MovieRepository movieRepositiry;

    public List<Movie> allMovie(){
 return movieRepositiry.findAll();
    }
    public Optional<Movie>  singleMovie(String imdbId){
        return movieRepositiry.findMovieByImdbId(imdbId);
    }
}

