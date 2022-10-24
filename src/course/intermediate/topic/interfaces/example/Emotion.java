package course.intermediate.topic.interfaces.example;

public enum Emotion implements Emoticonable{
    LAUGHING{
        @Override
        public String toString() {
            return getIcon();
        }
    },
    CRYING{
        @Override
        public String getIcon() {
            return ";'-(";
        }
    };

    @Override
    public String getIcon() {
        return ";-|";
    }
}
