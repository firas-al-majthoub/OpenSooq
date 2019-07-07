package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy extends com.firas.opensooq.data.db.model.weather.WeatherInfo
    implements RealmObjectProxy, com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface {

    static final class WeatherInfoColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long cityIndex;
        long coordinateIndex;
        long weatherIndex;
        long baseIndex;
        long mainIndex;
        long visibilityIndex;
        long windIndex;
        long cloudsIndex;
        long dtIndex;
        long sysIndex;
        long timezoneIndex;
        long idIndex;
        long nameIndex;
        long codeIndex;

        WeatherInfoColumnInfo(OsSchemaInfo schemaInfo) {
            super(14);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("WeatherInfo");
            this.cityIndex = addColumnDetails("city", "city", objectSchemaInfo);
            this.coordinateIndex = addColumnDetails("coordinate", "coordinate", objectSchemaInfo);
            this.weatherIndex = addColumnDetails("weather", "weather", objectSchemaInfo);
            this.baseIndex = addColumnDetails("base", "base", objectSchemaInfo);
            this.mainIndex = addColumnDetails("main", "main", objectSchemaInfo);
            this.visibilityIndex = addColumnDetails("visibility", "visibility", objectSchemaInfo);
            this.windIndex = addColumnDetails("wind", "wind", objectSchemaInfo);
            this.cloudsIndex = addColumnDetails("clouds", "clouds", objectSchemaInfo);
            this.dtIndex = addColumnDetails("dt", "dt", objectSchemaInfo);
            this.sysIndex = addColumnDetails("sys", "sys", objectSchemaInfo);
            this.timezoneIndex = addColumnDetails("timezone", "timezone", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.codeIndex = addColumnDetails("code", "code", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        WeatherInfoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WeatherInfoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WeatherInfoColumnInfo src = (WeatherInfoColumnInfo) rawSrc;
            final WeatherInfoColumnInfo dst = (WeatherInfoColumnInfo) rawDst;
            dst.cityIndex = src.cityIndex;
            dst.coordinateIndex = src.coordinateIndex;
            dst.weatherIndex = src.weatherIndex;
            dst.baseIndex = src.baseIndex;
            dst.mainIndex = src.mainIndex;
            dst.visibilityIndex = src.visibilityIndex;
            dst.windIndex = src.windIndex;
            dst.cloudsIndex = src.cloudsIndex;
            dst.dtIndex = src.dtIndex;
            dst.sysIndex = src.sysIndex;
            dst.timezoneIndex = src.timezoneIndex;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.codeIndex = src.codeIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private WeatherInfoColumnInfo columnInfo;
    private ProxyState<com.firas.opensooq.data.db.model.weather.WeatherInfo> proxyState;
    private RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherRealmList;

    com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WeatherInfoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.firas.opensooq.data.db.model.weather.WeatherInfo>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$city() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cityIndex);
    }

    @Override
    public void realmSet$city(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'city' cannot be changed after object was created.");
    }

    @Override
    public com.firas.opensooq.data.db.model.weather.Coordinate realmGet$coordinate() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.coordinateIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.firas.opensooq.data.db.model.weather.Coordinate.class, proxyState.getRow$realm().getLink(columnInfo.coordinateIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$coordinate(com.firas.opensooq.data.db.model.weather.Coordinate value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("coordinate")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.coordinateIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.coordinateIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.coordinateIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.coordinateIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public RealmList<com.firas.opensooq.data.db.model.weather.Weather> realmGet$weather() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (weatherRealmList != null) {
            return weatherRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.weatherIndex);
            weatherRealmList = new RealmList<com.firas.opensooq.data.db.model.weather.Weather>(com.firas.opensooq.data.db.model.weather.Weather.class, osList, proxyState.getRealm$realm());
            return weatherRealmList;
        }
    }

    @Override
    public void realmSet$weather(RealmList<com.firas.opensooq.data.db.model.weather.Weather> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("weather")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.firas.opensooq.data.db.model.weather.Weather> original = value;
                value = new RealmList<com.firas.opensooq.data.db.model.weather.Weather>();
                for (com.firas.opensooq.data.db.model.weather.Weather item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.weatherIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.firas.opensooq.data.db.model.weather.Weather linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.firas.opensooq.data.db.model.weather.Weather linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$base() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.baseIndex);
    }

    @Override
    public void realmSet$base(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.baseIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.baseIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.baseIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.baseIndex, value);
    }

    @Override
    public com.firas.opensooq.data.db.model.weather.Main realmGet$main() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.mainIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.firas.opensooq.data.db.model.weather.Main.class, proxyState.getRow$realm().getLink(columnInfo.mainIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$main(com.firas.opensooq.data.db.model.weather.Main value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("main")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.mainIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.mainIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.mainIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.mainIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$visibility() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.visibilityIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.visibilityIndex);
    }

    @Override
    public void realmSet$visibility(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.visibilityIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.visibilityIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.visibilityIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.visibilityIndex, value);
    }

    @Override
    public com.firas.opensooq.data.db.model.weather.Wind realmGet$wind() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.windIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.firas.opensooq.data.db.model.weather.Wind.class, proxyState.getRow$realm().getLink(columnInfo.windIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$wind(com.firas.opensooq.data.db.model.weather.Wind value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("wind")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.windIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.windIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.windIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.windIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public com.firas.opensooq.data.db.model.weather.Clouds realmGet$clouds() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.cloudsIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.firas.opensooq.data.db.model.weather.Clouds.class, proxyState.getRow$realm().getLink(columnInfo.cloudsIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$clouds(com.firas.opensooq.data.db.model.weather.Clouds value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("clouds")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.cloudsIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.cloudsIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.cloudsIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.cloudsIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$dt() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dtIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.dtIndex);
    }

    @Override
    public void realmSet$dt(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.dtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dtIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.dtIndex, value);
    }

    @Override
    public com.firas.opensooq.data.db.model.weather.Sys realmGet$sys() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.sysIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.firas.opensooq.data.db.model.weather.Sys.class, proxyState.getRow$realm().getLink(columnInfo.sysIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$sys(com.firas.opensooq.data.db.model.weather.Sys value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("sys")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.sysIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.sysIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.sysIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.sysIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$timezone() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.timezoneIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.timezoneIndex);
    }

    @Override
    public void realmSet$timezone(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.timezoneIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.timezoneIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.timezoneIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.timezoneIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$code() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.codeIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.codeIndex);
    }

    @Override
    public void realmSet$code(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.codeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.codeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.codeIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.codeIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("WeatherInfo", 14, 0);
        builder.addPersistedProperty("city", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("coordinate", RealmFieldType.OBJECT, "Coordinate");
        builder.addPersistedLinkProperty("weather", RealmFieldType.LIST, "Weather");
        builder.addPersistedProperty("base", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("main", RealmFieldType.OBJECT, "Main");
        builder.addPersistedProperty("visibility", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("wind", RealmFieldType.OBJECT, "Wind");
        builder.addPersistedLinkProperty("clouds", RealmFieldType.OBJECT, "Clouds");
        builder.addPersistedProperty("dt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("sys", RealmFieldType.OBJECT, "Sys");
        builder.addPersistedProperty("timezone", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("code", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WeatherInfoColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WeatherInfoColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "WeatherInfo";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "WeatherInfo";
    }

    @SuppressWarnings("cast")
    public static com.firas.opensooq.data.db.model.weather.WeatherInfo createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(6);
        com.firas.opensooq.data.db.model.weather.WeatherInfo obj = null;
        if (update) {
            Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
            WeatherInfoColumnInfo columnInfo = (WeatherInfoColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
            long pkColumnIndex = columnInfo.cityIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("city")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("city"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.WeatherInfo.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("coordinate")) {
                excludeFields.add("coordinate");
            }
            if (json.has("weather")) {
                excludeFields.add("weather");
            }
            if (json.has("main")) {
                excludeFields.add("main");
            }
            if (json.has("wind")) {
                excludeFields.add("wind");
            }
            if (json.has("clouds")) {
                excludeFields.add("clouds");
            }
            if (json.has("sys")) {
                excludeFields.add("sys");
            }
            if (json.has("city")) {
                if (json.isNull("city")) {
                    obj = (io.realm.com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy) realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.WeatherInfo.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy) realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.WeatherInfo.class, json.getString("city"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'city'.");
            }
        }

        final com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) obj;
        if (json.has("coordinate")) {
            if (json.isNull("coordinate")) {
                objProxy.realmSet$coordinate(null);
            } else {
                com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("coordinate"), update);
                objProxy.realmSet$coordinate(coordinateObj);
            }
        }
        if (json.has("weather")) {
            if (json.isNull("weather")) {
                objProxy.realmSet$weather(null);
            } else {
                objProxy.realmGet$weather().clear();
                JSONArray array = json.getJSONArray("weather");
                for (int i = 0; i < array.length(); i++) {
                    com.firas.opensooq.data.db.model.weather.Weather item = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$weather().add(item);
                }
            }
        }
        if (json.has("base")) {
            if (json.isNull("base")) {
                objProxy.realmSet$base(null);
            } else {
                objProxy.realmSet$base((String) json.getString("base"));
            }
        }
        if (json.has("main")) {
            if (json.isNull("main")) {
                objProxy.realmSet$main(null);
            } else {
                com.firas.opensooq.data.db.model.weather.Main mainObj = com_firas_opensooq_data_db_model_weather_MainRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("main"), update);
                objProxy.realmSet$main(mainObj);
            }
        }
        if (json.has("visibility")) {
            if (json.isNull("visibility")) {
                objProxy.realmSet$visibility(null);
            } else {
                objProxy.realmSet$visibility((int) json.getInt("visibility"));
            }
        }
        if (json.has("wind")) {
            if (json.isNull("wind")) {
                objProxy.realmSet$wind(null);
            } else {
                com.firas.opensooq.data.db.model.weather.Wind windObj = com_firas_opensooq_data_db_model_weather_WindRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("wind"), update);
                objProxy.realmSet$wind(windObj);
            }
        }
        if (json.has("clouds")) {
            if (json.isNull("clouds")) {
                objProxy.realmSet$clouds(null);
            } else {
                com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("clouds"), update);
                objProxy.realmSet$clouds(cloudsObj);
            }
        }
        if (json.has("dt")) {
            if (json.isNull("dt")) {
                objProxy.realmSet$dt(null);
            } else {
                objProxy.realmSet$dt((int) json.getInt("dt"));
            }
        }
        if (json.has("sys")) {
            if (json.isNull("sys")) {
                objProxy.realmSet$sys(null);
            } else {
                com.firas.opensooq.data.db.model.weather.Sys sysObj = com_firas_opensooq_data_db_model_weather_SysRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("sys"), update);
                objProxy.realmSet$sys(sysObj);
            }
        }
        if (json.has("timezone")) {
            if (json.isNull("timezone")) {
                objProxy.realmSet$timezone(null);
            } else {
                objProxy.realmSet$timezone((int) json.getInt("timezone"));
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("code")) {
            if (json.isNull("code")) {
                objProxy.realmSet$code(null);
            } else {
                objProxy.realmSet$code((int) json.getInt("code"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.firas.opensooq.data.db.model.weather.WeatherInfo createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.firas.opensooq.data.db.model.weather.WeatherInfo obj = new com.firas.opensooq.data.db.model.weather.WeatherInfo();
        final com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("city")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$city((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$city(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("coordinate")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$coordinate(null);
                } else {
                    com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$coordinate(coordinateObj);
                }
            } else if (name.equals("weather")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$weather(null);
                } else {
                    objProxy.realmSet$weather(new RealmList<com.firas.opensooq.data.db.model.weather.Weather>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.firas.opensooq.data.db.model.weather.Weather item = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$weather().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("base")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$base((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$base(null);
                }
            } else if (name.equals("main")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$main(null);
                } else {
                    com.firas.opensooq.data.db.model.weather.Main mainObj = com_firas_opensooq_data_db_model_weather_MainRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$main(mainObj);
                }
            } else if (name.equals("visibility")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$visibility((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$visibility(null);
                }
            } else if (name.equals("wind")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$wind(null);
                } else {
                    com.firas.opensooq.data.db.model.weather.Wind windObj = com_firas_opensooq_data_db_model_weather_WindRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$wind(windObj);
                }
            } else if (name.equals("clouds")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$clouds(null);
                } else {
                    com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$clouds(cloudsObj);
                }
            } else if (name.equals("dt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dt((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dt(null);
                }
            } else if (name.equals("sys")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$sys(null);
                } else {
                    com.firas.opensooq.data.db.model.weather.Sys sysObj = com_firas_opensooq_data_db_model_weather_SysRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$sys(sysObj);
                }
            } else if (name.equals("timezone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timezone((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$timezone(null);
                }
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("code")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$code((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$code(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'city'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.WeatherInfo.class), false, Collections.<String>emptyList());
        io.realm.com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy obj = new io.realm.com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.firas.opensooq.data.db.model.weather.WeatherInfo copyOrUpdate(Realm realm, WeatherInfoColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.WeatherInfo object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.WeatherInfo) cachedRealmObject;
        }

        com.firas.opensooq.data.db.model.weather.WeatherInfo realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
            long pkColumnIndex = columnInfo.cityIndex;
            String value = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$city();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.firas.opensooq.data.db.model.weather.WeatherInfo copy(Realm realm, WeatherInfoColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.WeatherInfo newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.WeatherInfo) cachedRealmObject;
        }

        com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) newObject;

        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.cityIndex, realmObjectSource.realmGet$city());
        builder.addString(columnInfo.baseIndex, realmObjectSource.realmGet$base());
        builder.addInteger(columnInfo.visibilityIndex, realmObjectSource.realmGet$visibility());
        builder.addInteger(columnInfo.dtIndex, realmObjectSource.realmGet$dt());
        builder.addInteger(columnInfo.timezoneIndex, realmObjectSource.realmGet$timezone());
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addInteger(columnInfo.codeIndex, realmObjectSource.realmGet$code());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = realmObjectSource.realmGet$coordinate();
        if (coordinateObj == null) {
            realmObjectCopy.realmSet$coordinate(null);
        } else {
            com.firas.opensooq.data.db.model.weather.Coordinate cachecoordinate = (com.firas.opensooq.data.db.model.weather.Coordinate) cache.get(coordinateObj);
            if (cachecoordinate != null) {
                realmObjectCopy.realmSet$coordinate(cachecoordinate);
            } else {
                realmObjectCopy.realmSet$coordinate(com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.CoordinateColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Coordinate.class), coordinateObj, update, cache, flags));
            }
        }

        RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherList = realmObjectSource.realmGet$weather();
        if (weatherList != null) {
            RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherRealmList = realmObjectCopy.realmGet$weather();
            weatherRealmList.clear();
            for (int i = 0; i < weatherList.size(); i++) {
                com.firas.opensooq.data.db.model.weather.Weather weatherItem = weatherList.get(i);
                com.firas.opensooq.data.db.model.weather.Weather cacheweather = (com.firas.opensooq.data.db.model.weather.Weather) cache.get(weatherItem);
                if (cacheweather != null) {
                    weatherRealmList.add(cacheweather);
                } else {
                    weatherRealmList.add(com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.WeatherColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Weather.class), weatherItem, update, cache, flags));
                }
            }
        }

        com.firas.opensooq.data.db.model.weather.Main mainObj = realmObjectSource.realmGet$main();
        if (mainObj == null) {
            realmObjectCopy.realmSet$main(null);
        } else {
            com.firas.opensooq.data.db.model.weather.Main cachemain = (com.firas.opensooq.data.db.model.weather.Main) cache.get(mainObj);
            if (cachemain != null) {
                realmObjectCopy.realmSet$main(cachemain);
            } else {
                realmObjectCopy.realmSet$main(com_firas_opensooq_data_db_model_weather_MainRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_MainRealmProxy.MainColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Main.class), mainObj, update, cache, flags));
            }
        }

        com.firas.opensooq.data.db.model.weather.Wind windObj = realmObjectSource.realmGet$wind();
        if (windObj == null) {
            realmObjectCopy.realmSet$wind(null);
        } else {
            com.firas.opensooq.data.db.model.weather.Wind cachewind = (com.firas.opensooq.data.db.model.weather.Wind) cache.get(windObj);
            if (cachewind != null) {
                realmObjectCopy.realmSet$wind(cachewind);
            } else {
                realmObjectCopy.realmSet$wind(com_firas_opensooq_data_db_model_weather_WindRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_WindRealmProxy.WindColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Wind.class), windObj, update, cache, flags));
            }
        }

        com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = realmObjectSource.realmGet$clouds();
        if (cloudsObj == null) {
            realmObjectCopy.realmSet$clouds(null);
        } else {
            com.firas.opensooq.data.db.model.weather.Clouds cacheclouds = (com.firas.opensooq.data.db.model.weather.Clouds) cache.get(cloudsObj);
            if (cacheclouds != null) {
                realmObjectCopy.realmSet$clouds(cacheclouds);
            } else {
                realmObjectCopy.realmSet$clouds(com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.CloudsColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Clouds.class), cloudsObj, update, cache, flags));
            }
        }

        com.firas.opensooq.data.db.model.weather.Sys sysObj = realmObjectSource.realmGet$sys();
        if (sysObj == null) {
            realmObjectCopy.realmSet$sys(null);
        } else {
            com.firas.opensooq.data.db.model.weather.Sys cachesys = (com.firas.opensooq.data.db.model.weather.Sys) cache.get(sysObj);
            if (cachesys != null) {
                realmObjectCopy.realmSet$sys(cachesys);
            } else {
                realmObjectCopy.realmSet$sys(com_firas_opensooq_data_db_model_weather_SysRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_SysRealmProxy.SysColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Sys.class), sysObj, update, cache, flags));
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.firas.opensooq.data.db.model.weather.WeatherInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long tableNativePtr = table.getNativePtr();
        WeatherInfoColumnInfo columnInfo = (WeatherInfoColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long pkColumnIndex = columnInfo.cityIndex;
        String primaryKeyValue = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$city();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);

        com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$coordinate();
        if (coordinateObj != null) {
            Long cachecoordinate = cache.get(coordinateObj);
            if (cachecoordinate == null) {
                cachecoordinate = com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.insert(realm, coordinateObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.coordinateIndex, rowIndex, cachecoordinate, false);
        }

        RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherList = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$weather();
        if (weatherList != null) {
            OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
            for (com.firas.opensooq.data.db.model.weather.Weather weatherItem : weatherList) {
                Long cacheItemIndexweather = cache.get(weatherItem);
                if (cacheItemIndexweather == null) {
                    cacheItemIndexweather = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.insert(realm, weatherItem, cache);
                }
                weatherOsList.addRow(cacheItemIndexweather);
            }
        }
        String realmGet$base = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$base();
        if (realmGet$base != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.baseIndex, rowIndex, realmGet$base, false);
        }

        com.firas.opensooq.data.db.model.weather.Main mainObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$main();
        if (mainObj != null) {
            Long cachemain = cache.get(mainObj);
            if (cachemain == null) {
                cachemain = com_firas_opensooq_data_db_model_weather_MainRealmProxy.insert(realm, mainObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.mainIndex, rowIndex, cachemain, false);
        }
        Number realmGet$visibility = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$visibility();
        if (realmGet$visibility != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.visibilityIndex, rowIndex, realmGet$visibility.longValue(), false);
        }

        com.firas.opensooq.data.db.model.weather.Wind windObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$wind();
        if (windObj != null) {
            Long cachewind = cache.get(windObj);
            if (cachewind == null) {
                cachewind = com_firas_opensooq_data_db_model_weather_WindRealmProxy.insert(realm, windObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.windIndex, rowIndex, cachewind, false);
        }

        com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$clouds();
        if (cloudsObj != null) {
            Long cacheclouds = cache.get(cloudsObj);
            if (cacheclouds == null) {
                cacheclouds = com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.insert(realm, cloudsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
        }
        Number realmGet$dt = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
        }

        com.firas.opensooq.data.db.model.weather.Sys sysObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$sys();
        if (sysObj != null) {
            Long cachesys = cache.get(sysObj);
            if (cachesys == null) {
                cachesys = com_firas_opensooq_data_db_model_weather_SysRealmProxy.insert(realm, sysObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.sysIndex, rowIndex, cachesys, false);
        }
        Number realmGet$timezone = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$timezone();
        if (realmGet$timezone != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.timezoneIndex, rowIndex, realmGet$timezone.longValue(), false);
        }
        Number realmGet$id = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        }
        String realmGet$name = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        Number realmGet$code = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long tableNativePtr = table.getNativePtr();
        WeatherInfoColumnInfo columnInfo = (WeatherInfoColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long pkColumnIndex = columnInfo.cityIndex;
        com.firas.opensooq.data.db.model.weather.WeatherInfo object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.WeatherInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$city();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);

            com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$coordinate();
            if (coordinateObj != null) {
                Long cachecoordinate = cache.get(coordinateObj);
                if (cachecoordinate == null) {
                    cachecoordinate = com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.insert(realm, coordinateObj, cache);
                }
                table.setLink(columnInfo.coordinateIndex, rowIndex, cachecoordinate, false);
            }

            RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherList = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$weather();
            if (weatherList != null) {
                OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
                for (com.firas.opensooq.data.db.model.weather.Weather weatherItem : weatherList) {
                    Long cacheItemIndexweather = cache.get(weatherItem);
                    if (cacheItemIndexweather == null) {
                        cacheItemIndexweather = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.insert(realm, weatherItem, cache);
                    }
                    weatherOsList.addRow(cacheItemIndexweather);
                }
            }
            String realmGet$base = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$base();
            if (realmGet$base != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.baseIndex, rowIndex, realmGet$base, false);
            }

            com.firas.opensooq.data.db.model.weather.Main mainObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$main();
            if (mainObj != null) {
                Long cachemain = cache.get(mainObj);
                if (cachemain == null) {
                    cachemain = com_firas_opensooq_data_db_model_weather_MainRealmProxy.insert(realm, mainObj, cache);
                }
                table.setLink(columnInfo.mainIndex, rowIndex, cachemain, false);
            }
            Number realmGet$visibility = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$visibility();
            if (realmGet$visibility != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.visibilityIndex, rowIndex, realmGet$visibility.longValue(), false);
            }

            com.firas.opensooq.data.db.model.weather.Wind windObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$wind();
            if (windObj != null) {
                Long cachewind = cache.get(windObj);
                if (cachewind == null) {
                    cachewind = com_firas_opensooq_data_db_model_weather_WindRealmProxy.insert(realm, windObj, cache);
                }
                table.setLink(columnInfo.windIndex, rowIndex, cachewind, false);
            }

            com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$clouds();
            if (cloudsObj != null) {
                Long cacheclouds = cache.get(cloudsObj);
                if (cacheclouds == null) {
                    cacheclouds = com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.insert(realm, cloudsObj, cache);
                }
                table.setLink(columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
            }
            Number realmGet$dt = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$dt();
            if (realmGet$dt != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
            }

            com.firas.opensooq.data.db.model.weather.Sys sysObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$sys();
            if (sysObj != null) {
                Long cachesys = cache.get(sysObj);
                if (cachesys == null) {
                    cachesys = com_firas_opensooq_data_db_model_weather_SysRealmProxy.insert(realm, sysObj, cache);
                }
                table.setLink(columnInfo.sysIndex, rowIndex, cachesys, false);
            }
            Number realmGet$timezone = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$timezone();
            if (realmGet$timezone != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.timezoneIndex, rowIndex, realmGet$timezone.longValue(), false);
            }
            Number realmGet$id = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            }
            String realmGet$name = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            Number realmGet$code = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$code();
            if (realmGet$code != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.firas.opensooq.data.db.model.weather.WeatherInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long tableNativePtr = table.getNativePtr();
        WeatherInfoColumnInfo columnInfo = (WeatherInfoColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long pkColumnIndex = columnInfo.cityIndex;
        String primaryKeyValue = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$city();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);

        com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$coordinate();
        if (coordinateObj != null) {
            Long cachecoordinate = cache.get(coordinateObj);
            if (cachecoordinate == null) {
                cachecoordinate = com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.insertOrUpdate(realm, coordinateObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.coordinateIndex, rowIndex, cachecoordinate, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.coordinateIndex, rowIndex);
        }

        OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
        RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherList = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$weather();
        if (weatherList != null && weatherList.size() == weatherOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = weatherList.size();
            for (int i = 0; i < objects; i++) {
                com.firas.opensooq.data.db.model.weather.Weather weatherItem = weatherList.get(i);
                Long cacheItemIndexweather = cache.get(weatherItem);
                if (cacheItemIndexweather == null) {
                    cacheItemIndexweather = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                }
                weatherOsList.setRow(i, cacheItemIndexweather);
            }
        } else {
            weatherOsList.removeAll();
            if (weatherList != null) {
                for (com.firas.opensooq.data.db.model.weather.Weather weatherItem : weatherList) {
                    Long cacheItemIndexweather = cache.get(weatherItem);
                    if (cacheItemIndexweather == null) {
                        cacheItemIndexweather = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                    }
                    weatherOsList.addRow(cacheItemIndexweather);
                }
            }
        }

        String realmGet$base = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$base();
        if (realmGet$base != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.baseIndex, rowIndex, realmGet$base, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.baseIndex, rowIndex, false);
        }

        com.firas.opensooq.data.db.model.weather.Main mainObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$main();
        if (mainObj != null) {
            Long cachemain = cache.get(mainObj);
            if (cachemain == null) {
                cachemain = com_firas_opensooq_data_db_model_weather_MainRealmProxy.insertOrUpdate(realm, mainObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.mainIndex, rowIndex, cachemain, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.mainIndex, rowIndex);
        }
        Number realmGet$visibility = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$visibility();
        if (realmGet$visibility != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.visibilityIndex, rowIndex, realmGet$visibility.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.visibilityIndex, rowIndex, false);
        }

        com.firas.opensooq.data.db.model.weather.Wind windObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$wind();
        if (windObj != null) {
            Long cachewind = cache.get(windObj);
            if (cachewind == null) {
                cachewind = com_firas_opensooq_data_db_model_weather_WindRealmProxy.insertOrUpdate(realm, windObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.windIndex, rowIndex, cachewind, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.windIndex, rowIndex);
        }

        com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$clouds();
        if (cloudsObj != null) {
            Long cacheclouds = cache.get(cloudsObj);
            if (cacheclouds == null) {
                cacheclouds = com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.insertOrUpdate(realm, cloudsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex);
        }
        Number realmGet$dt = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dtIndex, rowIndex, false);
        }

        com.firas.opensooq.data.db.model.weather.Sys sysObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$sys();
        if (sysObj != null) {
            Long cachesys = cache.get(sysObj);
            if (cachesys == null) {
                cachesys = com_firas_opensooq_data_db_model_weather_SysRealmProxy.insertOrUpdate(realm, sysObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.sysIndex, rowIndex, cachesys, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.sysIndex, rowIndex);
        }
        Number realmGet$timezone = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$timezone();
        if (realmGet$timezone != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.timezoneIndex, rowIndex, realmGet$timezone.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timezoneIndex, rowIndex, false);
        }
        Number realmGet$id = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$name = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        Number realmGet$code = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.codeIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long tableNativePtr = table.getNativePtr();
        WeatherInfoColumnInfo columnInfo = (WeatherInfoColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        long pkColumnIndex = columnInfo.cityIndex;
        com.firas.opensooq.data.db.model.weather.WeatherInfo object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.WeatherInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$city();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);

            com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$coordinate();
            if (coordinateObj != null) {
                Long cachecoordinate = cache.get(coordinateObj);
                if (cachecoordinate == null) {
                    cachecoordinate = com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.insertOrUpdate(realm, coordinateObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.coordinateIndex, rowIndex, cachecoordinate, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.coordinateIndex, rowIndex);
            }

            OsList weatherOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.weatherIndex);
            RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherList = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$weather();
            if (weatherList != null && weatherList.size() == weatherOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = weatherList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.firas.opensooq.data.db.model.weather.Weather weatherItem = weatherList.get(i);
                    Long cacheItemIndexweather = cache.get(weatherItem);
                    if (cacheItemIndexweather == null) {
                        cacheItemIndexweather = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                    }
                    weatherOsList.setRow(i, cacheItemIndexweather);
                }
            } else {
                weatherOsList.removeAll();
                if (weatherList != null) {
                    for (com.firas.opensooq.data.db.model.weather.Weather weatherItem : weatherList) {
                        Long cacheItemIndexweather = cache.get(weatherItem);
                        if (cacheItemIndexweather == null) {
                            cacheItemIndexweather = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.insertOrUpdate(realm, weatherItem, cache);
                        }
                        weatherOsList.addRow(cacheItemIndexweather);
                    }
                }
            }

            String realmGet$base = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$base();
            if (realmGet$base != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.baseIndex, rowIndex, realmGet$base, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.baseIndex, rowIndex, false);
            }

            com.firas.opensooq.data.db.model.weather.Main mainObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$main();
            if (mainObj != null) {
                Long cachemain = cache.get(mainObj);
                if (cachemain == null) {
                    cachemain = com_firas_opensooq_data_db_model_weather_MainRealmProxy.insertOrUpdate(realm, mainObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.mainIndex, rowIndex, cachemain, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.mainIndex, rowIndex);
            }
            Number realmGet$visibility = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$visibility();
            if (realmGet$visibility != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.visibilityIndex, rowIndex, realmGet$visibility.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.visibilityIndex, rowIndex, false);
            }

            com.firas.opensooq.data.db.model.weather.Wind windObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$wind();
            if (windObj != null) {
                Long cachewind = cache.get(windObj);
                if (cachewind == null) {
                    cachewind = com_firas_opensooq_data_db_model_weather_WindRealmProxy.insertOrUpdate(realm, windObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.windIndex, rowIndex, cachewind, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.windIndex, rowIndex);
            }

            com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$clouds();
            if (cloudsObj != null) {
                Long cacheclouds = cache.get(cloudsObj);
                if (cacheclouds == null) {
                    cacheclouds = com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.insertOrUpdate(realm, cloudsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex, cacheclouds, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.cloudsIndex, rowIndex);
            }
            Number realmGet$dt = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$dt();
            if (realmGet$dt != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dtIndex, rowIndex, realmGet$dt.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dtIndex, rowIndex, false);
            }

            com.firas.opensooq.data.db.model.weather.Sys sysObj = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$sys();
            if (sysObj != null) {
                Long cachesys = cache.get(sysObj);
                if (cachesys == null) {
                    cachesys = com_firas_opensooq_data_db_model_weather_SysRealmProxy.insertOrUpdate(realm, sysObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.sysIndex, rowIndex, cachesys, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.sysIndex, rowIndex);
            }
            Number realmGet$timezone = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$timezone();
            if (realmGet$timezone != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.timezoneIndex, rowIndex, realmGet$timezone.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timezoneIndex, rowIndex, false);
            }
            Number realmGet$id = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            String realmGet$name = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            Number realmGet$code = ((com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) object).realmGet$code();
            if (realmGet$code != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.codeIndex, rowIndex, false);
            }
        }
    }

    public static com.firas.opensooq.data.db.model.weather.WeatherInfo createDetachedCopy(com.firas.opensooq.data.db.model.weather.WeatherInfo realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.firas.opensooq.data.db.model.weather.WeatherInfo unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.firas.opensooq.data.db.model.weather.WeatherInfo();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.firas.opensooq.data.db.model.weather.WeatherInfo) cachedObject.object;
            }
            unmanagedObject = (com.firas.opensooq.data.db.model.weather.WeatherInfo) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface unmanagedCopy = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) unmanagedObject;
        com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface realmSource = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$city(realmSource.realmGet$city());

        // Deep copy of coordinate
        unmanagedCopy.realmSet$coordinate(com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.createDetachedCopy(realmSource.realmGet$coordinate(), currentDepth + 1, maxDepth, cache));

        // Deep copy of weather
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$weather(null);
        } else {
            RealmList<com.firas.opensooq.data.db.model.weather.Weather> managedweatherList = realmSource.realmGet$weather();
            RealmList<com.firas.opensooq.data.db.model.weather.Weather> unmanagedweatherList = new RealmList<com.firas.opensooq.data.db.model.weather.Weather>();
            unmanagedCopy.realmSet$weather(unmanagedweatherList);
            int nextDepth = currentDepth + 1;
            int size = managedweatherList.size();
            for (int i = 0; i < size; i++) {
                com.firas.opensooq.data.db.model.weather.Weather item = com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.createDetachedCopy(managedweatherList.get(i), nextDepth, maxDepth, cache);
                unmanagedweatherList.add(item);
            }
        }
        unmanagedCopy.realmSet$base(realmSource.realmGet$base());

        // Deep copy of main
        unmanagedCopy.realmSet$main(com_firas_opensooq_data_db_model_weather_MainRealmProxy.createDetachedCopy(realmSource.realmGet$main(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$visibility(realmSource.realmGet$visibility());

        // Deep copy of wind
        unmanagedCopy.realmSet$wind(com_firas_opensooq_data_db_model_weather_WindRealmProxy.createDetachedCopy(realmSource.realmGet$wind(), currentDepth + 1, maxDepth, cache));

        // Deep copy of clouds
        unmanagedCopy.realmSet$clouds(com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.createDetachedCopy(realmSource.realmGet$clouds(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$dt(realmSource.realmGet$dt());

        // Deep copy of sys
        unmanagedCopy.realmSet$sys(com_firas_opensooq_data_db_model_weather_SysRealmProxy.createDetachedCopy(realmSource.realmGet$sys(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$timezone(realmSource.realmGet$timezone());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$code(realmSource.realmGet$code());

        return unmanagedObject;
    }

    static com.firas.opensooq.data.db.model.weather.WeatherInfo update(Realm realm, WeatherInfoColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.WeatherInfo realmObject, com.firas.opensooq.data.db.model.weather.WeatherInfo newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface realmObjectTarget = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) realmObject;
        com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxyInterface) newObject;
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.WeatherInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.cityIndex, realmObjectSource.realmGet$city());

        com.firas.opensooq.data.db.model.weather.Coordinate coordinateObj = realmObjectSource.realmGet$coordinate();
        if (coordinateObj == null) {
            builder.addNull(columnInfo.coordinateIndex);
        } else {
            com.firas.opensooq.data.db.model.weather.Coordinate cachecoordinate = (com.firas.opensooq.data.db.model.weather.Coordinate) cache.get(coordinateObj);
            if (cachecoordinate != null) {
                builder.addObject(columnInfo.coordinateIndex, cachecoordinate);
            } else {
                builder.addObject(columnInfo.coordinateIndex, com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy.CoordinateColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Coordinate.class), coordinateObj, true, cache, flags));
            }
        }

        RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherList = realmObjectSource.realmGet$weather();
        if (weatherList != null) {
            RealmList<com.firas.opensooq.data.db.model.weather.Weather> weatherManagedCopy = new RealmList<com.firas.opensooq.data.db.model.weather.Weather>();
            for (int i = 0; i < weatherList.size(); i++) {
                com.firas.opensooq.data.db.model.weather.Weather weatherItem = weatherList.get(i);
                com.firas.opensooq.data.db.model.weather.Weather cacheweather = (com.firas.opensooq.data.db.model.weather.Weather) cache.get(weatherItem);
                if (cacheweather != null) {
                    weatherManagedCopy.add(cacheweather);
                } else {
                    weatherManagedCopy.add(com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_WeatherRealmProxy.WeatherColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Weather.class), weatherItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.weatherIndex, weatherManagedCopy);
        } else {
            builder.addObjectList(columnInfo.weatherIndex, new RealmList<com.firas.opensooq.data.db.model.weather.Weather>());
        }
        builder.addString(columnInfo.baseIndex, realmObjectSource.realmGet$base());

        com.firas.opensooq.data.db.model.weather.Main mainObj = realmObjectSource.realmGet$main();
        if (mainObj == null) {
            builder.addNull(columnInfo.mainIndex);
        } else {
            com.firas.opensooq.data.db.model.weather.Main cachemain = (com.firas.opensooq.data.db.model.weather.Main) cache.get(mainObj);
            if (cachemain != null) {
                builder.addObject(columnInfo.mainIndex, cachemain);
            } else {
                builder.addObject(columnInfo.mainIndex, com_firas_opensooq_data_db_model_weather_MainRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_MainRealmProxy.MainColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Main.class), mainObj, true, cache, flags));
            }
        }
        builder.addInteger(columnInfo.visibilityIndex, realmObjectSource.realmGet$visibility());

        com.firas.opensooq.data.db.model.weather.Wind windObj = realmObjectSource.realmGet$wind();
        if (windObj == null) {
            builder.addNull(columnInfo.windIndex);
        } else {
            com.firas.opensooq.data.db.model.weather.Wind cachewind = (com.firas.opensooq.data.db.model.weather.Wind) cache.get(windObj);
            if (cachewind != null) {
                builder.addObject(columnInfo.windIndex, cachewind);
            } else {
                builder.addObject(columnInfo.windIndex, com_firas_opensooq_data_db_model_weather_WindRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_WindRealmProxy.WindColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Wind.class), windObj, true, cache, flags));
            }
        }

        com.firas.opensooq.data.db.model.weather.Clouds cloudsObj = realmObjectSource.realmGet$clouds();
        if (cloudsObj == null) {
            builder.addNull(columnInfo.cloudsIndex);
        } else {
            com.firas.opensooq.data.db.model.weather.Clouds cacheclouds = (com.firas.opensooq.data.db.model.weather.Clouds) cache.get(cloudsObj);
            if (cacheclouds != null) {
                builder.addObject(columnInfo.cloudsIndex, cacheclouds);
            } else {
                builder.addObject(columnInfo.cloudsIndex, com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_CloudsRealmProxy.CloudsColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Clouds.class), cloudsObj, true, cache, flags));
            }
        }
        builder.addInteger(columnInfo.dtIndex, realmObjectSource.realmGet$dt());

        com.firas.opensooq.data.db.model.weather.Sys sysObj = realmObjectSource.realmGet$sys();
        if (sysObj == null) {
            builder.addNull(columnInfo.sysIndex);
        } else {
            com.firas.opensooq.data.db.model.weather.Sys cachesys = (com.firas.opensooq.data.db.model.weather.Sys) cache.get(sysObj);
            if (cachesys != null) {
                builder.addObject(columnInfo.sysIndex, cachesys);
            } else {
                builder.addObject(columnInfo.sysIndex, com_firas_opensooq_data_db_model_weather_SysRealmProxy.copyOrUpdate(realm, (com_firas_opensooq_data_db_model_weather_SysRealmProxy.SysColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Sys.class), sysObj, true, cache, flags));
            }
        }
        builder.addInteger(columnInfo.timezoneIndex, realmObjectSource.realmGet$timezone());
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addInteger(columnInfo.codeIndex, realmObjectSource.realmGet$code());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("WeatherInfo = proxy[");
        stringBuilder.append("{city:");
        stringBuilder.append(realmGet$city() != null ? realmGet$city() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{coordinate:");
        stringBuilder.append(realmGet$coordinate() != null ? "Coordinate" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{weather:");
        stringBuilder.append("RealmList<Weather>[").append(realmGet$weather().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{base:");
        stringBuilder.append(realmGet$base() != null ? realmGet$base() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{main:");
        stringBuilder.append(realmGet$main() != null ? "Main" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{visibility:");
        stringBuilder.append(realmGet$visibility() != null ? realmGet$visibility() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{wind:");
        stringBuilder.append(realmGet$wind() != null ? "Wind" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{clouds:");
        stringBuilder.append(realmGet$clouds() != null ? "Clouds" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dt:");
        stringBuilder.append(realmGet$dt() != null ? realmGet$dt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sys:");
        stringBuilder.append(realmGet$sys() != null ? "Sys" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timezone:");
        stringBuilder.append(realmGet$timezone() != null ? realmGet$timezone() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{code:");
        stringBuilder.append(realmGet$code() != null ? realmGet$code() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy aWeatherInfo = (com_firas_opensooq_data_db_model_weather_WeatherInfoRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aWeatherInfo.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWeatherInfo.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aWeatherInfo.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
