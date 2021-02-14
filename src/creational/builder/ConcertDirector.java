package creational.builder;

/** Модель концертного директора, использует нужного строителя через общий интерфейс для получения нужной для клиента
 * разновидности объекта оркестра.
 *  * @author Сергей Шершавин*/

public class ConcertDirector {
    private OrchestraBuilder orchestraBuilder;

    public void setOrchestraBuilder(OrchestraBuilder orchestraBuilder) {
        this.orchestraBuilder = orchestraBuilder;
    }

    public Orchestra createOrchestra(OrchestraSize size) {
        return orchestraBuilder.setSize(size).drumsBuild().stringsBuild().windBuild().build();
    }

}
