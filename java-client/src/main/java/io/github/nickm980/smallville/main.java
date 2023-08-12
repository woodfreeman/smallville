public class Main {
    public static void main(String[] args) {
        // 创建一个SmallvilleClient的实例
        SmallvilleClient client = SmallvilleClient.create("http://localhost:8080/", new MyAgentHandlerCallback());

        // 使用client的方法
        client.createAgent("Agent1", List.of("Memory1", "Memory2"), "Location1", "Activity1");
        client.createLocation("Location1", "State1");
        client.ask("Agent1", "Question1");
        client.updateState();
        client.addObservation("Agent1", "Observation1", true);
    }
}