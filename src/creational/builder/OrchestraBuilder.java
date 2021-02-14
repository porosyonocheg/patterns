package creational.builder;

/** Базовый строитель. Устанавливает размер оркестра, описывает общий интерфейс для строителей.
 *  * @author Сергей Шершавин*/

public abstract class OrchestraBuilder {
    protected Orchestra orchestra = new Orchestra();
    protected OrchestraSize size;

    public abstract OrchestraBuilder stringsBuild();
    public abstract OrchestraBuilder drumsBuild();
    public abstract OrchestraBuilder windBuild();

    public OrchestraBuilder setSize(OrchestraSize size) {
        this.size = size;
        return this;
    }

    public Orchestra build() {
        return orchestra;
    }
}
