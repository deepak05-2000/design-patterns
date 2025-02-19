package compositedesignpattern;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("readme.md"));
        Folder movies = new Folder("movies");
        Folder comedyMovies = new Folder("Comedy");
        comedyMovies.add(new File("Hera-Pheri"));
        Folder hauntedMovies = new Folder("Haunted");
        hauntedMovies.add(new File("1920"));
        movies.add(comedyMovies);
        movies.add(hauntedMovies);
        root.add(movies);

        root.ls(" ");

    }
}
