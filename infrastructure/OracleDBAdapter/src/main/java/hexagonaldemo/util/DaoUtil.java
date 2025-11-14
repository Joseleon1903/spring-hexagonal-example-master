package hexagonaldemo.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class DaoUtil {


    public static String getStringColumn(Map<String, Object> resulset , String columnName){
        if(resulset.get(columnName) != null){
            return resulset.get(columnName).toString();
        }
        return null;
    }

    public static Long getLongColumn(Map<String, Object> resulset , String columnName){
        if(resulset.get(columnName) != null){
            return Long.parseLong( resulset.get(columnName).toString());
        }
        return null;
    }

    public static Integer getIntegerColumn(Map<String, Object> resulset , String columnName){
        if(resulset.get(columnName) != null){
            return Integer.parseInt( resulset.get(columnName).toString());
        }
        return null;
    }

    public static Short getShortColumn(Map<String, Object> resulset , String columnName){
        if(resulset.get(columnName) != null){
            return Short.parseShort( resulset.get(columnName).toString());
        }
        return null;
    }

    public static LocalDate getLocalDate(Map<String, Object> resulset , String columnName) {
        Object obj = resulset.get(columnName);

        if (obj == null) {
            throw new IllegalArgumentException("El objeto no puede ser nulo");
        }

        if (obj instanceof LocalDate) {
            // Ya es LocalDate
            return (LocalDate) obj;
        } else if (obj instanceof String) {
            // Convertir desde String (asume formato ISO por defecto)
            return LocalDate.parse((String) obj, DateTimeFormatter.ISO_DATE);
        } else if (obj instanceof java.sql.Date) {
            // Convertir desde java.sql.Date
            return ((java.sql.Date) obj).toLocalDate();
        } else if (obj instanceof java.util.Date) {
            // Convertir desde java.util.Date
            return ((java.util.Date) obj).toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
        } else {
            throw new IllegalArgumentException("Tipo no compatible para convertir a LocalDate: " + obj.getClass());
        }
    }
}
