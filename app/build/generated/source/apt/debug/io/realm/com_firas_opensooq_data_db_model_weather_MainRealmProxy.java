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
public class com_firas_opensooq_data_db_model_weather_MainRealmProxy extends com.firas.opensooq.data.db.model.weather.Main
    implements RealmObjectProxy, com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface {

    static final class MainColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long tempIndex;
        long pressureIndex;
        long humidityIndex;
        long tempMinIndex;
        long tempMaxIndex;

        MainColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Main");
            this.tempIndex = addColumnDetails("temp", "temp", objectSchemaInfo);
            this.pressureIndex = addColumnDetails("pressure", "pressure", objectSchemaInfo);
            this.humidityIndex = addColumnDetails("humidity", "humidity", objectSchemaInfo);
            this.tempMinIndex = addColumnDetails("tempMin", "tempMin", objectSchemaInfo);
            this.tempMaxIndex = addColumnDetails("tempMax", "tempMax", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MainColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MainColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MainColumnInfo src = (MainColumnInfo) rawSrc;
            final MainColumnInfo dst = (MainColumnInfo) rawDst;
            dst.tempIndex = src.tempIndex;
            dst.pressureIndex = src.pressureIndex;
            dst.humidityIndex = src.humidityIndex;
            dst.tempMinIndex = src.tempMinIndex;
            dst.tempMaxIndex = src.tempMaxIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MainColumnInfo columnInfo;
    private ProxyState<com.firas.opensooq.data.db.model.weather.Main> proxyState;

    com_firas_opensooq_data_db_model_weather_MainRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MainColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.firas.opensooq.data.db.model.weather.Main>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$temp() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.tempIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.tempIndex);
    }

    @Override
    public void realmSet$temp(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tempIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.tempIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tempIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.tempIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$pressure() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.pressureIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.pressureIndex);
    }

    @Override
    public void realmSet$pressure(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.pressureIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.pressureIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.pressureIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.pressureIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$humidity() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.humidityIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.humidityIndex);
    }

    @Override
    public void realmSet$humidity(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.humidityIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.humidityIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.humidityIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.humidityIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$tempMin() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.tempMinIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.tempMinIndex);
    }

    @Override
    public void realmSet$tempMin(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tempMinIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.tempMinIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tempMinIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.tempMinIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$tempMax() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.tempMaxIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.tempMaxIndex);
    }

    @Override
    public void realmSet$tempMax(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tempMaxIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.tempMaxIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tempMaxIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.tempMaxIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Main", 5, 0);
        builder.addPersistedProperty("temp", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("pressure", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("humidity", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tempMin", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tempMax", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MainColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MainColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Main";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Main";
    }

    @SuppressWarnings("cast")
    public static com.firas.opensooq.data.db.model.weather.Main createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.firas.opensooq.data.db.model.weather.Main obj = realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.Main.class, true, excludeFields);

        final com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) obj;
        if (json.has("temp")) {
            if (json.isNull("temp")) {
                objProxy.realmSet$temp(null);
            } else {
                objProxy.realmSet$temp((double) json.getDouble("temp"));
            }
        }
        if (json.has("pressure")) {
            if (json.isNull("pressure")) {
                objProxy.realmSet$pressure(null);
            } else {
                objProxy.realmSet$pressure((int) json.getInt("pressure"));
            }
        }
        if (json.has("humidity")) {
            if (json.isNull("humidity")) {
                objProxy.realmSet$humidity(null);
            } else {
                objProxy.realmSet$humidity((int) json.getInt("humidity"));
            }
        }
        if (json.has("tempMin")) {
            if (json.isNull("tempMin")) {
                objProxy.realmSet$tempMin(null);
            } else {
                objProxy.realmSet$tempMin((double) json.getDouble("tempMin"));
            }
        }
        if (json.has("tempMax")) {
            if (json.isNull("tempMax")) {
                objProxy.realmSet$tempMax(null);
            } else {
                objProxy.realmSet$tempMax((double) json.getDouble("tempMax"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.firas.opensooq.data.db.model.weather.Main createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.firas.opensooq.data.db.model.weather.Main obj = new com.firas.opensooq.data.db.model.weather.Main();
        final com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("temp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$temp((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$temp(null);
                }
            } else if (name.equals("pressure")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pressure((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$pressure(null);
                }
            } else if (name.equals("humidity")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$humidity((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$humidity(null);
                }
            } else if (name.equals("tempMin")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tempMin((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tempMin(null);
                }
            } else if (name.equals("tempMax")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tempMax((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tempMax(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_firas_opensooq_data_db_model_weather_MainRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Main.class), false, Collections.<String>emptyList());
        io.realm.com_firas_opensooq_data_db_model_weather_MainRealmProxy obj = new io.realm.com_firas_opensooq_data_db_model_weather_MainRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.firas.opensooq.data.db.model.weather.Main copyOrUpdate(Realm realm, MainColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Main object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.firas.opensooq.data.db.model.weather.Main) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.firas.opensooq.data.db.model.weather.Main copy(Realm realm, MainColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Main newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.Main) cachedRealmObject;
        }

        com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) newObject;

        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Main.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addDouble(columnInfo.tempIndex, realmObjectSource.realmGet$temp());
        builder.addInteger(columnInfo.pressureIndex, realmObjectSource.realmGet$pressure());
        builder.addInteger(columnInfo.humidityIndex, realmObjectSource.realmGet$humidity());
        builder.addDouble(columnInfo.tempMinIndex, realmObjectSource.realmGet$tempMin());
        builder.addDouble(columnInfo.tempMaxIndex, realmObjectSource.realmGet$tempMax());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_firas_opensooq_data_db_model_weather_MainRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.firas.opensooq.data.db.model.weather.Main object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Main.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Double realmGet$temp = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$temp();
        if (realmGet$temp != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
        }
        Number realmGet$pressure = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$pressure();
        if (realmGet$pressure != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure.longValue(), false);
        }
        Number realmGet$humidity = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$humidity();
        if (realmGet$humidity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
        }
        Double realmGet$tempMin = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMin();
        if (realmGet$tempMin != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinIndex, rowIndex, realmGet$tempMin, false);
        }
        Double realmGet$tempMax = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMax();
        if (realmGet$tempMax != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxIndex, rowIndex, realmGet$tempMax, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Main.class);
        com.firas.opensooq.data.db.model.weather.Main object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Main) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Double realmGet$temp = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$temp();
            if (realmGet$temp != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
            }
            Number realmGet$pressure = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$pressure();
            if (realmGet$pressure != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure.longValue(), false);
            }
            Number realmGet$humidity = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$humidity();
            if (realmGet$humidity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
            }
            Double realmGet$tempMin = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMin();
            if (realmGet$tempMin != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinIndex, rowIndex, realmGet$tempMin, false);
            }
            Double realmGet$tempMax = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMax();
            if (realmGet$tempMax != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxIndex, rowIndex, realmGet$tempMax, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.firas.opensooq.data.db.model.weather.Main object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Main.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Double realmGet$temp = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$temp();
        if (realmGet$temp != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tempIndex, rowIndex, false);
        }
        Number realmGet$pressure = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$pressure();
        if (realmGet$pressure != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pressureIndex, rowIndex, false);
        }
        Number realmGet$humidity = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$humidity();
        if (realmGet$humidity != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.humidityIndex, rowIndex, false);
        }
        Double realmGet$tempMin = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMin();
        if (realmGet$tempMin != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinIndex, rowIndex, realmGet$tempMin, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tempMinIndex, rowIndex, false);
        }
        Double realmGet$tempMax = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMax();
        if (realmGet$tempMax != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxIndex, rowIndex, realmGet$tempMax, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tempMaxIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Main.class);
        long tableNativePtr = table.getNativePtr();
        MainColumnInfo columnInfo = (MainColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Main.class);
        com.firas.opensooq.data.db.model.weather.Main object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Main) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Double realmGet$temp = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$temp();
            if (realmGet$temp != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.tempIndex, rowIndex, realmGet$temp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tempIndex, rowIndex, false);
            }
            Number realmGet$pressure = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$pressure();
            if (realmGet$pressure != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.pressureIndex, rowIndex, realmGet$pressure.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.pressureIndex, rowIndex, false);
            }
            Number realmGet$humidity = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$humidity();
            if (realmGet$humidity != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.humidityIndex, rowIndex, realmGet$humidity.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.humidityIndex, rowIndex, false);
            }
            Double realmGet$tempMin = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMin();
            if (realmGet$tempMin != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.tempMinIndex, rowIndex, realmGet$tempMin, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tempMinIndex, rowIndex, false);
            }
            Double realmGet$tempMax = ((com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) object).realmGet$tempMax();
            if (realmGet$tempMax != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.tempMaxIndex, rowIndex, realmGet$tempMax, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tempMaxIndex, rowIndex, false);
            }
        }
    }

    public static com.firas.opensooq.data.db.model.weather.Main createDetachedCopy(com.firas.opensooq.data.db.model.weather.Main realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.firas.opensooq.data.db.model.weather.Main unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.firas.opensooq.data.db.model.weather.Main();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.firas.opensooq.data.db.model.weather.Main) cachedObject.object;
            }
            unmanagedObject = (com.firas.opensooq.data.db.model.weather.Main) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface unmanagedCopy = (com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) unmanagedObject;
        com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface realmSource = (com_firas_opensooq_data_db_model_weather_MainRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$temp(realmSource.realmGet$temp());
        unmanagedCopy.realmSet$pressure(realmSource.realmGet$pressure());
        unmanagedCopy.realmSet$humidity(realmSource.realmGet$humidity());
        unmanagedCopy.realmSet$tempMin(realmSource.realmGet$tempMin());
        unmanagedCopy.realmSet$tempMax(realmSource.realmGet$tempMax());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Main = proxy[");
        stringBuilder.append("{temp:");
        stringBuilder.append(realmGet$temp() != null ? realmGet$temp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pressure:");
        stringBuilder.append(realmGet$pressure() != null ? realmGet$pressure() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{humidity:");
        stringBuilder.append(realmGet$humidity() != null ? realmGet$humidity() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tempMin:");
        stringBuilder.append(realmGet$tempMin() != null ? realmGet$tempMin() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tempMax:");
        stringBuilder.append(realmGet$tempMax() != null ? realmGet$tempMax() : "null");
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
        com_firas_opensooq_data_db_model_weather_MainRealmProxy aMain = (com_firas_opensooq_data_db_model_weather_MainRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMain.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMain.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMain.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
