import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        initializeScene(primaryStage);
        primaryStage.show();
    }

    private void initializeScene(Stage primaryStage) {
        Group parentNode = new Group();
        Scene scene = setupScene(parentNode, primaryStage);

        Boom boomShape = new Boom(ColorsProvider.boomColor, PointsProvider.boomPoints);
        appendToScene(parentNode, boomShape.build());

        Sail sailShape = new Sail(ColorsProvider.sailColor, PointsProvider.sailPoints);
        appendToScene(parentNode, sailShape.build());

        Boat boatShape = new Boat(ColorsProvider.boatColor, PointsProvider.boatPoints);
        appendToScene(parentNode, boatShape.build());
    }

    private void appendToScene(Group node, Shape shape) {
        node.getChildren().add(shape);
    }

    private Scene setupScene(Group node, Stage primaryStage) {
        Scene scene = new Scene(node, PointsProvider.windowWidth, PointsProvider.windowHeight);
        primaryStage.setScene(scene);
        scene.setFill(Color.valueOf(ColorsProvider.backgroundColor));
        return scene;
    }
}
