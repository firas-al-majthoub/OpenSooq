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
public class com_firas_opensooq_data_db_model_weather_SysRealmProxy extends com.firas.opensooq.data.db.model.weather.Sys
    implements RealmObjectProxy, com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface {

    static final class SysColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long typeIndex;
        long sysIdIndex;
        long messageIndex;
        long countryIndex;
        long sunriseIndex;
        long sunsetIndex;

        SysColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Sys");
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.sysIdIndex = addColumnDetails("sysId", "sysId", objectSchemaInfo);
            this.messageIndex = addColumnDetails("message", "message", objectSchemaInfo);
            this.countryIndex = addColumnDetails("country", "country", objectSchemaInfo);
            this.sunriseIndex = addColumnDetails("sunrise", "sunrise", objectSchemaInfo);
            this.sunsetIndex = addColumnDetails("sunset", "sunset", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SysColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SysColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SysColumnInfo src = (SysColumnInfo) rawSrc;
            final SysColumnInfo dst = (SysColumnInfo) rawDst;
            dst.typeIndex = src.typeIndex;
            dst.sysIdIndex = src.sysIdIndex;
            dst.messageIndex = src.messageIndex;
            dst.countryIndex = src.countryIndex;
            dst.sunriseIndex = src.sunriseIndex;
            dst.sunsetIndex = src.sunsetIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SysColumnInfo columnInfo;
    private ProxyState<com.firas.opensooq.data.db.model.weather.Sys> proxyState;

    com_firas_opensooq_data_db_model_weather_SysRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SysColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.firas.opensooq.data.db.model.weather.Sys>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.typeIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.typeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$sysId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.sysIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.sysIdIndex);
    }

    @Override
    public void realmSet$sysId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sysIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.sysIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sysIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.sysIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$message() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.messageIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.messageIndex);
    }

    @Override
    public void realmSet$message(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.messageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.messageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.messageIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.messageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$country() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.countryIndex);
    }

    @Override
    public void realmSet$country(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.countryIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.countryIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.countryIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.countryIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$sunrise() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.sunriseIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.sunriseIndex);
    }

    @Override
    public void realmSet$sunrise(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sunriseIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.sunriseIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sunriseIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.sunriseIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$sunset() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.sunsetIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.sunsetIndex);
    }

    @Override
    public void realmSet$sunset(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sunsetIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.sunsetIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sunsetIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.sunsetIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Sys", 6, 0);
        builder.addPersistedProperty("type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sysId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("message", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("country", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sunrise", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sunset", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SysColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SysColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Sys";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Sys";
    }

    @SuppressWarnings("cast")
    public static com.firas.opensooq.data.db.model.weather.Sys createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.firas.opensooq.data.db.model.weather.Sys obj = realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.Sys.class, true, excludeFields);

        final com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) obj;
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((int) json.getInt("type"));
            }
        }
        if (json.has("sysId")) {
            if (json.isNull("sysId")) {
                objProxy.realmSet$sysId(null);
            } else {
                objProxy.realmSet$sysId((int) json.getInt("sysId"));
            }
        }
        if (json.has("message")) {
            if (json.isNull("message")) {
                objProxy.realmSet$message(null);
            } else {
                objProxy.realmSet$message((double) json.getDouble("message"));
            }
        }
        if (json.has("country")) {
            if (json.isNull("country")) {
                objProxy.realmSet$country(null);
            } else {
                objProxy.realmSet$country((String) json.getString("country"));
            }
        }
        if (json.has("sunrise")) {
            if (json.isNull("sunrise")) {
                objProxy.realmSet$sunrise(null);
            } else {
                objProxy.realmSet$sunrise((int) json.getInt("sunrise"));
            }
        }
        if (json.has("sunset")) {
            if (json.isNull("sunset")) {
                objProxy.realmSet$sunset(null);
            } else {
                objProxy.realmSet$sunset((int) json.getInt("sunset"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.firas.opensooq.data.db.model.weather.Sys createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.firas.opensooq.data.db.model.weather.Sys obj = new com.firas.opensooq.data.db.model.weather.Sys();
        final com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("sysId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sysId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sysId(null);
                }
            } else if (name.equals("message")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$message((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$message(null);
                }
            } else if (name.equals("country")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$country((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$country(null);
                }
            } else if (name.equals("sunrise")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sunrise((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sunrise(null);
                }
            } else if (name.equals("sunset")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sunset((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sunset(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_firas_opensooq_data_db_model_weather_SysRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Sys.class), false, Collections.<String>emptyList());
        io.realm.com_firas_opensooq_data_db_model_weather_SysRealmProxy obj = new io.realm.com_firas_opensooq_data_db_model_weather_SysRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.firas.opensooq.data.db.model.weather.Sys copyOrUpdate(Realm realm, SysColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Sys object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.firas.opensooq.data.db.model.weather.Sys) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.firas.opensooq.data.db.model.weather.Sys copy(Realm realm, SysColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Sys newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.Sys) cachedRealmObject;
        }

        com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) newObject;

        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Sys.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.typeIndex, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.sysIdIndex, realmObjectSource.realmGet$sysId());
        builder.addDouble(columnInfo.messageIndex, realmObjectSource.realmGet$message());
        builder.addString(columnInfo.countryIndex, realmObjectSource.realmGet$country());
        builder.addInteger(columnInfo.sunriseIndex, realmObjectSource.realmGet$sunrise());
        builder.addInteger(columnInfo.sunsetIndex, realmObjectSource.realmGet$sunset());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_firas_opensooq_data_db_model_weather_SysRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.firas.opensooq.data.db.model.weather.Sys object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Sys.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$type = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type.longValue(), false);
        }
        Number realmGet$sysId = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sysId();
        if (realmGet$sysId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.sysIdIndex, rowIndex, realmGet$sysId.longValue(), false);
        }
        Double realmGet$message = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
        }
        String realmGet$country = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$country();
        if (realmGet$country != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countryIndex, rowIndex, realmGet$country, false);
        }
        Number realmGet$sunrise = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunrise();
        if (realmGet$sunrise != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.sunriseIndex, rowIndex, realmGet$sunrise.longValue(), false);
        }
        Number realmGet$sunset = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunset();
        if (realmGet$sunset != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.sunsetIndex, rowIndex, realmGet$sunset.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Sys.class);
        com.firas.opensooq.data.db.model.weather.Sys object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Sys) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$type = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type.longValue(), false);
            }
            Number realmGet$sysId = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sysId();
            if (realmGet$sysId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.sysIdIndex, rowIndex, realmGet$sysId.longValue(), false);
            }
            Double realmGet$message = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$message();
            if (realmGet$message != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
            }
            String realmGet$country = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$country();
            if (realmGet$country != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countryIndex, rowIndex, realmGet$country, false);
            }
            Number realmGet$sunrise = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunrise();
            if (realmGet$sunrise != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.sunriseIndex, rowIndex, realmGet$sunrise.longValue(), false);
            }
            Number realmGet$sunset = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunset();
            if (realmGet$sunset != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.sunsetIndex, rowIndex, realmGet$sunset.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.firas.opensooq.data.db.model.weather.Sys object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Sys.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$type = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        Number realmGet$sysId = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sysId();
        if (realmGet$sysId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.sysIdIndex, rowIndex, realmGet$sysId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sysIdIndex, rowIndex, false);
        }
        Double realmGet$message = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.messageIndex, rowIndex, false);
        }
        String realmGet$country = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$country();
        if (realmGet$country != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countryIndex, rowIndex, realmGet$country, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.countryIndex, rowIndex, false);
        }
        Number realmGet$sunrise = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunrise();
        if (realmGet$sunrise != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.sunriseIndex, rowIndex, realmGet$sunrise.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sunriseIndex, rowIndex, false);
        }
        Number realmGet$sunset = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunset();
        if (realmGet$sunset != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.sunsetIndex, rowIndex, realmGet$sunset.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sunsetIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Sys.class);
        long tableNativePtr = table.getNativePtr();
        SysColumnInfo columnInfo = (SysColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Sys.class);
        com.firas.opensooq.data.db.model.weather.Sys object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Sys) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$type = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }
            Number realmGet$sysId = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sysId();
            if (realmGet$sysId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.sysIdIndex, rowIndex, realmGet$sysId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sysIdIndex, rowIndex, false);
            }
            Double realmGet$message = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$message();
            if (realmGet$message != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.messageIndex, rowIndex, false);
            }
            String realmGet$country = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$country();
            if (realmGet$country != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countryIndex, rowIndex, realmGet$country, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.countryIndex, rowIndex, false);
            }
            Number realmGet$sunrise = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunrise();
            if (realmGet$sunrise != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.sunriseIndex, rowIndex, realmGet$sunrise.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sunriseIndex, rowIndex, false);
            }
            Number realmGet$sunset = ((com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) object).realmGet$sunset();
            if (realmGet$sunset != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.sunsetIndex, rowIndex, realmGet$sunset.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sunsetIndex, rowIndex, false);
            }
        }
    }

    public static com.firas.opensooq.data.db.model.weather.Sys createDetachedCopy(com.firas.opensooq.data.db.model.weather.Sys realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.firas.opensooq.data.db.model.weather.Sys unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.firas.opensooq.data.db.model.weather.Sys();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.firas.opensooq.data.db.model.weather.Sys) cachedObject.object;
            }
            unmanagedObject = (com.firas.opensooq.data.db.model.weather.Sys) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface unmanagedCopy = (com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) unmanagedObject;
        com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface realmSource = (com_firas_opensooq_data_db_model_weather_SysRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$sysId(realmSource.realmGet$sysId());
        unmanagedCopy.realmSet$message(realmSource.realmGet$message());
        unmanagedCopy.realmSet$country(realmSource.realmGet$country());
        unmanagedCopy.realmSet$sunrise(realmSource.realmGet$sunrise());
        unmanagedCopy.realmSet$sunset(realmSource.realmGet$sunset());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Sys = proxy[");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sysId:");
        stringBuilder.append(realmGet$sysId() != null ? realmGet$sysId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{message:");
        stringBuilder.append(realmGet$message() != null ? realmGet$message() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{country:");
        stringBuilder.append(realmGet$country() != null ? realmGet$country() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sunrise:");
        stringBuilder.append(realmGet$sunrise() != null ? realmGet$sunrise() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sunset:");
        stringBuilder.append(realmGet$sunset() != null ? realmGet$sunset() : "null");
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
        com_firas_opensooq_data_db_model_weather_SysRealmProxy aSys = (com_firas_opensooq_data_db_model_weather_SysRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aSys.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSys.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aSys.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
