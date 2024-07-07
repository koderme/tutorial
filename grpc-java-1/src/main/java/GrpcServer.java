import com.koderme.grpc.greeting.services.GreetingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public final class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;

        Server server = ServerBuilder.forPort(port)
                .addService(new GreetingServiceImpl())
//                .addService(ProtoReflectionService.newInstance())
//                .intercept(new LogInterceptor())
//                .intercept(new HeaderCheckInterceptor())
                .build();

        server.start();
        System.out.println("Server Started");
        System.out.println("Listening on port: " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Server Stopped");
        }));

        server.awaitTermination();
    }
}