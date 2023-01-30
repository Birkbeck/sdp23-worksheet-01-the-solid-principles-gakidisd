public class Greeter<T>{
    T formality;

    public final String greet() {
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }

    public final void setFormality(T formality) {
        this.formality = formality;
    }
}
