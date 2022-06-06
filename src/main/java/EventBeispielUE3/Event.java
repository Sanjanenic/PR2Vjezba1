package EventBeispielUE3;

public class Event {

        private String title;
        private String ort;
        private double entrittpreis;

        public Event() {
        }

        public Event(String title, String ort, double entrittpreis) {
            this.title = title;
            this.ort = ort;
            this.entrittpreis = entrittpreis;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOrt() {
            return ort;
        }

        public void setOrt(String ort) {
            this.ort = ort;
        }

        public double getEntrittpreis() {
            return entrittpreis;
        }

        public void setEntrittpreis(double entrittpreis) {
            this.entrittpreis = entrittpreis;
        }

        @Override
        public String toString() {
            return "Event{" +
                    "title='" + title + '\'' +
                    ", ort='" + ort + '\'' +
                    ", entrittpreis=" + entrittpreis +
                    '}';
        }
    }


