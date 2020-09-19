import java.util.Arrays;

public class Media {
    public String title;
    public int lengthInMinuets;
    public String[] actors;


    public Media(String title, int lengthInMinuets, String[] actors) {
        this.title = title;
        this.lengthInMinuets = lengthInMinuets;
        this.actors = actors;


    }

        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public double getLengthInMinuets () {
            return lengthInMinuets;
        }

        public void setLengthInMinuets ( int lengthInMinuets){
            this.lengthInMinuets = lengthInMinuets;
        }

        public String[] getActors () {
            String output = Arrays.toString(actors);

            return actors;
        }

        public void setActors (String[]actors){


            this.actors = actors;
        }


    }


