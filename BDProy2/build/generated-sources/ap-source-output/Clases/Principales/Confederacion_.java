package Clases.Principales;

import Clases.Principales.Equipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T00:45:25")
@StaticMetamodel(Confederacion.class)
public class Confederacion_ { 

    public static volatile SingularAttribute<Confederacion, String> codigoconfederacion;
    public static volatile CollectionAttribute<Confederacion, Equipo> equipoCollection;
    public static volatile SingularAttribute<Confederacion, String> nombre;

}