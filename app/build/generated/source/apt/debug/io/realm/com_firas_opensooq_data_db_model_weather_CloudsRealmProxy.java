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
public class com_firas_opensooq_data_db_model_weather_CloudsRealmProxy extends com.firas.opensooq.data.db.model.weather.Clouds
    implements RealmObjectProxy, com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface {

    static final class CloudsColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long allIndex;

        CloudsColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Clouds");
            this.allIndex = addColumnDetails("all", "all", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CloudsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CloudsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CloudsColumnInfo src = (CloudsColumnInfo) rawSrc;
            final CloudsColumnInfo dst = (CloudsColumnInfo) rawDst;
            dst.allIndex = src.allIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CloudsColumnInfo columnInfo;
    private ProxyState<com.firas.opensooq.data.db.model.weather.Clouds> proxyState;

    com_firas_opensooq_data_db_model_weather_CloudsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CloudsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.firas.opensooq.data.db.model.weather.Clouds>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$all() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.allIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.allIndex);
    }

    @Override
    public void realmSet$all(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.allIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.allIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.allIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.allIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Clouds", 1, 0);
        builder.addPersistedProperty("all", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CloudsColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CloudsColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Clouds";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Clouds";
    }

    @SuppressWarnings("cast")
    public static com.firas.opensooq.data.db.model.weather.Clouds createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.firas.opensooq.data.db.model.weather.Clouds obj = realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.Clouds.class, true, excludeFields);

        final com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) obj;
        if (json.has("all")) {
            if (json.isNull("all")) {
                objProxy.realmSet$all(null);
            } else {
                objProxy.realmSet$all((int) json.getInt("all"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.firas.opensooq.data.db.model.weather.Clouds createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.firas.opensooq.data.db.model.weather.Clouds obj = new com.firas.opensooq.data.db.model.weather.Clouds();
        final com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("all")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$all((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$all(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_firas_opensooq_data_db_model_weather_CloudsRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Clouds.class), false, Collections.<String>emptyList());
        io.realm.com_firas_opensooq_data_db_model_weather_CloudsRealmProxy obj = new io.realm.com_firas_opensooq_data_db_model_weather_CloudsRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.firas.opensooq.data.db.model.weather.Clouds copyOrUpdate(Realm realm, CloudsColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Clouds object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.firas.opensooq.data.db.model.weather.Clouds) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.firas.opensooq.data.db.model.weather.Clouds copy(Realm realm, CloudsColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Clouds newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.Clouds) cachedRealmObject;
        }

        com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) newObject;

        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Clouds.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.allIndex, realmObjectSource.realmGet$all());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_firas_opensooq_data_db_model_weather_CloudsRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.firas.opensooq.data.db.model.weather.Clouds object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Clouds.class);
        long tableNativePtr = table.getNativePtr();
        CloudsColumnInfo columnInfo = (CloudsColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Clouds.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$all = ((com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) object).realmGet$all();
        if (realmGet$all != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.allIndex, rowIndex, realmGet$all.longValue(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Clouds.class);
        long tableNativePtr = table.getNativePtr();
        CloudsColumnInfo columnInfo = (CloudsColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Clouds.class);
        com.firas.opensooq.data.db.model.weather.Clouds object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Clouds) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$all = ((com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) object).realmGet$all();
            if (realmGet$all != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.allIndex, rowIndex, realmGet$all.longValue(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.firas.opensooq.data.db.model.weather.Clouds object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Clouds.class);
        long tableNativePtr = table.getNativePtr();
        CloudsColumnInfo columnInfo = (CloudsColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Clouds.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$all = ((com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) object).realmGet$all();
        if (realmGet$all != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.allIndex, rowIndex, realmGet$all.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.allIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Clouds.class);
        long tableNativePtr = table.getNativePtr();
        CloudsColumnInfo columnInfo = (CloudsColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Clouds.class);
        com.firas.opensooq.data.db.model.weather.Clouds object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Clouds) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$all = ((com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) object).realmGet$all();
            if (realmGet$all != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.allIndex, rowIndex, realmGet$all.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.allIndex, rowIndex, false);
            }
        }
    }

    public static com.firas.opensooq.data.db.model.weather.Clouds createDetachedCopy(com.firas.opensooq.data.db.model.weather.Clouds realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.firas.opensooq.data.db.model.weather.Clouds unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.firas.opensooq.data.db.model.weather.Clouds();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.firas.opensooq.data.db.model.weather.Clouds) cachedObject.object;
            }
            unmanagedObject = (com.firas.opensooq.data.db.model.weather.Clouds) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface unmanagedCopy = (com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) unmanagedObject;
        com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface realmSource = (com_firas_opensooq_data_db_model_weather_CloudsRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$all(realmSource.realmGet$all());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Clouds = proxy[");
        stringBuilder.append("{all:");
        stringBuilder.append(realmGet$all() != null ? realmGet$all() : "null");
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
        com_firas_opensooq_data_db_model_weather_CloudsRealmProxy aClouds = (com_firas_opensooq_data_db_model_weather_CloudsRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aClouds.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aClouds.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aClouds.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
