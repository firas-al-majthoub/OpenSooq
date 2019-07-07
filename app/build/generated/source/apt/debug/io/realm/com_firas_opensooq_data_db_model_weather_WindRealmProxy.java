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
public class com_firas_opensooq_data_db_model_weather_WindRealmProxy extends com.firas.opensooq.data.db.model.weather.Wind
    implements RealmObjectProxy, com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface {

    static final class WindColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long speedIndex;
        long degIndex;

        WindColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Wind");
            this.speedIndex = addColumnDetails("speed", "speed", objectSchemaInfo);
            this.degIndex = addColumnDetails("deg", "deg", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        WindColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WindColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WindColumnInfo src = (WindColumnInfo) rawSrc;
            final WindColumnInfo dst = (WindColumnInfo) rawDst;
            dst.speedIndex = src.speedIndex;
            dst.degIndex = src.degIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private WindColumnInfo columnInfo;
    private ProxyState<com.firas.opensooq.data.db.model.weather.Wind> proxyState;

    com_firas_opensooq_data_db_model_weather_WindRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WindColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.firas.opensooq.data.db.model.weather.Wind>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$speed() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.speedIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.speedIndex);
    }

    @Override
    public void realmSet$speed(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.speedIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.speedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.speedIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.speedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$deg() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.degIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.degIndex);
    }

    @Override
    public void realmSet$deg(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.degIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.degIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.degIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.degIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Wind", 2, 0);
        builder.addPersistedProperty("speed", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("deg", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WindColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WindColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Wind";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Wind";
    }

    @SuppressWarnings("cast")
    public static com.firas.opensooq.data.db.model.weather.Wind createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.firas.opensooq.data.db.model.weather.Wind obj = realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.Wind.class, true, excludeFields);

        final com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) obj;
        if (json.has("speed")) {
            if (json.isNull("speed")) {
                objProxy.realmSet$speed(null);
            } else {
                objProxy.realmSet$speed((double) json.getDouble("speed"));
            }
        }
        if (json.has("deg")) {
            if (json.isNull("deg")) {
                objProxy.realmSet$deg(null);
            } else {
                objProxy.realmSet$deg((int) json.getInt("deg"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.firas.opensooq.data.db.model.weather.Wind createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.firas.opensooq.data.db.model.weather.Wind obj = new com.firas.opensooq.data.db.model.weather.Wind();
        final com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("speed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$speed((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$speed(null);
                }
            } else if (name.equals("deg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deg((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deg(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_firas_opensooq_data_db_model_weather_WindRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Wind.class), false, Collections.<String>emptyList());
        io.realm.com_firas_opensooq_data_db_model_weather_WindRealmProxy obj = new io.realm.com_firas_opensooq_data_db_model_weather_WindRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.firas.opensooq.data.db.model.weather.Wind copyOrUpdate(Realm realm, WindColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Wind object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.firas.opensooq.data.db.model.weather.Wind) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.firas.opensooq.data.db.model.weather.Wind copy(Realm realm, WindColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Wind newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.Wind) cachedRealmObject;
        }

        com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) newObject;

        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Wind.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addDouble(columnInfo.speedIndex, realmObjectSource.realmGet$speed());
        builder.addInteger(columnInfo.degIndex, realmObjectSource.realmGet$deg());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_firas_opensooq_data_db_model_weather_WindRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.firas.opensooq.data.db.model.weather.Wind object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Wind.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Double realmGet$speed = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$speed();
        if (realmGet$speed != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
        }
        Number realmGet$deg = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$deg();
        if (realmGet$deg != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Wind.class);
        com.firas.opensooq.data.db.model.weather.Wind object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Wind) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Double realmGet$speed = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$speed();
            if (realmGet$speed != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
            }
            Number realmGet$deg = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$deg();
            if (realmGet$deg != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.firas.opensooq.data.db.model.weather.Wind object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Wind.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Double realmGet$speed = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$speed();
        if (realmGet$speed != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.speedIndex, rowIndex, false);
        }
        Number realmGet$deg = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$deg();
        if (realmGet$deg != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.degIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Wind.class);
        long tableNativePtr = table.getNativePtr();
        WindColumnInfo columnInfo = (WindColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Wind.class);
        com.firas.opensooq.data.db.model.weather.Wind object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Wind) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Double realmGet$speed = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$speed();
            if (realmGet$speed != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.speedIndex, rowIndex, realmGet$speed, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.speedIndex, rowIndex, false);
            }
            Number realmGet$deg = ((com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) object).realmGet$deg();
            if (realmGet$deg != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.degIndex, rowIndex, realmGet$deg.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.degIndex, rowIndex, false);
            }
        }
    }

    public static com.firas.opensooq.data.db.model.weather.Wind createDetachedCopy(com.firas.opensooq.data.db.model.weather.Wind realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.firas.opensooq.data.db.model.weather.Wind unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.firas.opensooq.data.db.model.weather.Wind();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.firas.opensooq.data.db.model.weather.Wind) cachedObject.object;
            }
            unmanagedObject = (com.firas.opensooq.data.db.model.weather.Wind) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface unmanagedCopy = (com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) unmanagedObject;
        com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface realmSource = (com_firas_opensooq_data_db_model_weather_WindRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$speed(realmSource.realmGet$speed());
        unmanagedCopy.realmSet$deg(realmSource.realmGet$deg());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Wind = proxy[");
        stringBuilder.append("{speed:");
        stringBuilder.append(realmGet$speed() != null ? realmGet$speed() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deg:");
        stringBuilder.append(realmGet$deg() != null ? realmGet$deg() : "null");
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
        com_firas_opensooq_data_db_model_weather_WindRealmProxy aWind = (com_firas_opensooq_data_db_model_weather_WindRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aWind.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWind.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aWind.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
