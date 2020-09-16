public class Media {
    private String title;
    private double lengthInMinuets;
    private String[] actors;


    public Media(String title, double lengthInMinuets, String[] Actors) {
        this.title = title;
        this.lengthInMinuets = lengthInMinuets;
        this.actors = actors;

        String[] movieActors = {"Jelo", "Jim", "Sonia"};
        String[] tvShowActors = {"Matt", "Lisa", "Jennifer"};

        Media movies = new Media("Angle Eyes", 102, movieActors);
        Media tvShows = new Media("Friends", 45, tvShowActors);
    }


        //System.out.println(movies);



        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public double getLengthInMinuets () {
            return lengthInMinuets;
        }

        public void setLengthInMinuets ( double lengthInMinuets){
            this.lengthInMinuets = lengthInMinuets;
        }

        public String[] getActors () {
            return actors;
        }

        public void setActors (String[]actors){
            this.actors = actors;
        }


    }


