package GameState;

public class GameApp {
    public static void main(String[] args) {
        GameProgress gameProgress = GameProgress.getInstance();
        gameProgress.updateLevel(1);
        
        AdversaryFactory adversaryFactory;
        GameComponentFactory componentFactory;

        if (gameProgress.getLevel() == 1) {
            adversaryFactory = new SimpleAdversaryFactory();
            componentFactory = new NoviceLevelFactory();
        } else {
            adversaryFactory = new DifficultAdversaryFactory();
            componentFactory = new ExpertLevelFactory();
        }
        Adversary adversary = adversaryFactory.generateAdversary();
        Armament armament = componentFactory.createArmament();
        Enhancement enhancement = componentFactory.createEnhancement();

        adversary.executeAttack();
        armament.deploy();
        enhancement.trigger();
    }
}
