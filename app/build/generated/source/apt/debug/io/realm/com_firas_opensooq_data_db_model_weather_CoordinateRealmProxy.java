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
public class com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy extends com.firas.opensooq.data.db.model.weather.Coordinate
    implements RealmObjectProxy, com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface {

    static final class CoordinateColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long lonIndex;
        long latIndex;

        CoordinateColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Coordinate");
            this.lonIndex = addColumnDetails("lon", "lon", objectSchemaInfo);
            this.latIndex = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CoordinateColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CoordinateColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CoordinateColumnInfo src = (CoordinateColumnInfo) rawSrc;
            final CoordinateColumnInfo dst = (CoordinateColumnInfo) rawDst;
            dst.lonIndex = src.lonIndex;
            dst.latIndex = src.latIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CoordinateColumnInfo columnInfo;
    private ProxyState<com.firas.opensooq.data.db.model.weather.Coordinate> proxyState;

    com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CoordinateColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.firas.opensooq.data.db.model.weather.Coordinate>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$lon() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.lonIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.lonIndex);
    }

    @Override
    public void realmSet$lon(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lonIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.lonIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lonIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.lonIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.latIndex)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latIndex);
    }

    @Override
    public void realmSet$lat(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.latIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.latIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.latIndex);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.latIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Coordinate", 2, 0);
        builder.addPersistedProperty("lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CoordinateColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CoordinateColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Coordinate";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Coordinate";
    }

    @SuppressWarnings("cast")
    public static com.firas.opensooq.data.db.model.weather.Coordinate createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.firas.opensooq.data.db.model.weather.Coordinate obj = realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.Coordinate.class, true, excludeFields);

        final com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) obj;
        if (json.has("lon")) {
            if (json.isNull("lon")) {
                objProxy.realmSet$lon(null);
            } else {
                objProxy.realmSet$lon((double) json.getDouble("lon"));
            }
        }
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                objProxy.realmSet$lat(null);
            } else {
                objProxy.realmSet$lat((double) json.getDouble("lat"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.firas.opensooq.data.db.model.weather.Coordinate createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.firas.opensooq.data.db.model.weather.Coordinate obj = new com.firas.opensooq.data.db.model.weather.Coordinate();
        final com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("lon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lon((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lon(null);
                }
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lat(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Coordinate.class), false, Collections.<String>emptyList());
        io.realm.com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy obj = new io.realm.com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.firas.opensooq.data.db.model.weather.Coordinate copyOrUpdate(Realm realm, CoordinateColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Coordinate object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.firas.opensooq.data.db.model.weather.Coordinate) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.firas.opensooq.data.db.model.weather.Coordinate copy(Realm realm, CoordinateColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Coordinate newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.Coordinate) cachedRealmObject;
        }

        com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) newObject;

        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addDouble(columnInfo.lonIndex, realmObjectSource.realmGet$lon());
        builder.addDouble(columnInfo.latIndex, realmObjectSource.realmGet$lat());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.firas.opensooq.data.db.model.weather.Coordinate object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        long tableNativePtr = table.getNativePtr();
        CoordinateColumnInfo columnInfo = (CoordinateColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Double realmGet$lon = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lon();
        if (realmGet$lon != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
        }
        Double realmGet$lat = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        long tableNativePtr = table.getNativePtr();
        CoordinateColumnInfo columnInfo = (CoordinateColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        com.firas.opensooq.data.db.model.weather.Coordinate object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Coordinate) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Double realmGet$lon = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lon();
            if (realmGet$lon != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
            }
            Double realmGet$lat = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.firas.opensooq.data.db.model.weather.Coordinate object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        long tableNativePtr = table.getNativePtr();
        CoordinateColumnInfo columnInfo = (CoordinateColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Double realmGet$lon = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lon();
        if (realmGet$lon != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lonIndex, rowIndex, false);
        }
        Double realmGet$lat = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        long tableNativePtr = table.getNativePtr();
        CoordinateColumnInfo columnInfo = (CoordinateColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Coordinate.class);
        com.firas.opensooq.data.db.model.weather.Coordinate object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Coordinate) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Double realmGet$lon = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lon();
            if (realmGet$lon != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lonIndex, rowIndex, realmGet$lon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lonIndex, rowIndex, false);
            }
            Double realmGet$lat = ((com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
            }
        }
    }

    public static com.firas.opensooq.data.db.model.weather.Coordinate createDetachedCopy(com.firas.opensooq.data.db.model.weather.Coordinate realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.firas.opensooq.data.db.model.weather.Coordinate unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.firas.opensooq.data.db.model.weather.Coordinate();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.firas.opensooq.data.db.model.weather.Coordinate) cachedObject.object;
            }
            unmanagedObject = (com.firas.opensooq.data.db.model.weather.Coordinate) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface unmanagedCopy = (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) unmanagedObject;
        com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface realmSource = (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Coordinate = proxy[");
        stringBuilder.append("{lon:");
        stringBuilder.append(realmGet$lon() != null ? realmGet$lon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lat:");
        stringBuilder.append(realmGet$lat() != null ? realmGet$lat() : "null");
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
        com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy aCoordinate = (com_firas_opensooq_data_db_model_weather_CoordinateRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCoordinate.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCoordinate.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCoordinate.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
