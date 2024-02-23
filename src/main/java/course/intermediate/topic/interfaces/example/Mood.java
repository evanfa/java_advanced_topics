package course.intermediate.topic.interfaces.example;

public enum Mood implements Emoticonable{
    GOOD {
        public String getIcon(){
        return ";-)";
        }
    },
    BAD {
            public String getIcon () {
            return ";-(";
            }
    }
    ;

    @Override
    public String getIcon() {
        return null;
    }

    @Override
    public String toString() {
        return getIcon();
    }
}
