package GameState;

abstract class Adversary {
    public abstract void executeAttack();
}

class SimpleAdversary extends Adversary {
    @Override
    public void executeAttack() {
        System.out.println("Simple adversary launches an attack!");
    }
}

class ModerateAdversary extends Adversary {
    @Override
    public void executeAttack() {
        System.out.println("Moderate adversary launches an attack!");
    }
}

class DifficultAdversary extends Adversary {
    @Override
    public void executeAttack() {
        System.out.println("Difficult adversary launches an attack!");
    }
}

abstract class AdversaryFactory {
    public abstract Adversary generateAdversary();
}

class SimpleAdversaryFactory extends AdversaryFactory {
    @Override
    public Adversary generateAdversary() {
        return new SimpleAdversary();
    }
}

class ModerateAdversaryFactory extends AdversaryFactory {
    @Override
    public Adversary generateAdversary() {
        return new ModerateAdversary();
    }
}

class DifficultAdversaryFactory extends AdversaryFactory {
    @Override
    public Adversary generateAdversary() {
        return new DifficultAdversary();
    }
}
