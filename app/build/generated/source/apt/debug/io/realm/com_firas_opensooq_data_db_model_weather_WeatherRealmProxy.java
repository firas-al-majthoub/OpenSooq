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
public class com_firas_opensooq_data_db_model_weather_WeatherRealmProxy extends com.firas.opensooq.data.db.model.weather.Weather
    implements RealmObjectProxy, com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface {

    static final class WeatherColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long statusIdIndex;
        long mainIndex;
        long descriptionIndex;
        long iconIndex;

        WeatherColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Weather");
            this.statusIdIndex = addColumnDetails("statusId", "statusId", objectSchemaInfo);
            this.mainIndex = addColumnDetails("main", "main", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.iconIndex = addColumnDetails("icon", "icon", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        WeatherColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WeatherColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WeatherColumnInfo src = (WeatherColumnInfo) rawSrc;
            final WeatherColumnInfo dst = (WeatherColumnInfo) rawDst;
            dst.statusIdIndex = src.statusIdIndex;
            dst.mainIndex = src.mainIndex;
            dst.descriptionIndex = src.descriptionIndex;
            dst.iconIndex = src.iconIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private WeatherColumnInfo columnInfo;
    private ProxyState<com.firas.opensooq.data.db.model.weather.Weather> proxyState;

    com_firas_opensooq_data_db_model_weather_WeatherRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WeatherColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.firas.opensooq.data.db.model.weather.Weather>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$statusId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.statusIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.statusIdIndex);
    }

    @Override
    public void realmSet$statusId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.statusIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.statusIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$main() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mainIndex);
    }

    @Override
    public void realmSet$main(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mainIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.mainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mainIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descriptionIndex);
    }

    @Override
    public void realmSet$description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descriptionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descriptionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descriptionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descriptionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$icon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.iconIndex);
    }

    @Override
    public void realmSet$icon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.iconIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.iconIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.iconIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.iconIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Weather", 4, 0);
        builder.addPersistedProperty("statusId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("main", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("icon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WeatherColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WeatherColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Weather";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Weather";
    }

    @SuppressWarnings("cast")
    public static com.firas.opensooq.data.db.model.weather.Weather createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.firas.opensooq.data.db.model.weather.Weather obj = realm.createObjectInternal(com.firas.opensooq.data.db.model.weather.Weather.class, true, excludeFields);

        final com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) obj;
        if (json.has("statusId")) {
            if (json.isNull("statusId")) {
                objProxy.realmSet$statusId(null);
            } else {
                objProxy.realmSet$statusId((int) json.getInt("statusId"));
            }
        }
        if (json.has("main")) {
            if (json.isNull("main")) {
                objProxy.realmSet$main(null);
            } else {
                objProxy.realmSet$main((String) json.getString("main"));
            }
        }
        if (json.has("description")) {
            if (json.isNull("description")) {
                objProxy.realmSet$description(null);
            } else {
                objProxy.realmSet$description((String) json.getString("description"));
            }
        }
        if (json.has("icon")) {
            if (json.isNull("icon")) {
                objProxy.realmSet$icon(null);
            } else {
                objProxy.realmSet$icon((String) json.getString("icon"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.firas.opensooq.data.db.model.weather.Weather createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.firas.opensooq.data.db.model.weather.Weather obj = new com.firas.opensooq.data.db.model.weather.Weather();
        final com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface objProxy = (com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("statusId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$statusId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$statusId(null);
                }
            } else if (name.equals("main")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$main((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$main(null);
                }
            } else if (name.equals("description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$description(null);
                }
            } else if (name.equals("icon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$icon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$icon(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_firas_opensooq_data_db_model_weather_WeatherRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Weather.class), false, Collections.<String>emptyList());
        io.realm.com_firas_opensooq_data_db_model_weather_WeatherRealmProxy obj = new io.realm.com_firas_opensooq_data_db_model_weather_WeatherRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.firas.opensooq.data.db.model.weather.Weather copyOrUpdate(Realm realm, WeatherColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Weather object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.firas.opensooq.data.db.model.weather.Weather) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.firas.opensooq.data.db.model.weather.Weather copy(Realm realm, WeatherColumnInfo columnInfo, com.firas.opensooq.data.db.model.weather.Weather newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.firas.opensooq.data.db.model.weather.Weather) cachedRealmObject;
        }

        com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface realmObjectSource = (com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) newObject;

        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Weather.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.statusIdIndex, realmObjectSource.realmGet$statusId());
        builder.addString(columnInfo.mainIndex, realmObjectSource.realmGet$main());
        builder.addString(columnInfo.descriptionIndex, realmObjectSource.realmGet$description());
        builder.addString(columnInfo.iconIndex, realmObjectSource.realmGet$icon());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_firas_opensooq_data_db_model_weather_WeatherRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.firas.opensooq.data.db.model.weather.Weather object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Weather.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$statusId = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$statusId();
        if (realmGet$statusId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.statusIdIndex, rowIndex, realmGet$statusId.longValue(), false);
        }
        String realmGet$main = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$main();
        if (realmGet$main != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
        }
        String realmGet$description = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        }
        String realmGet$icon = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Weather.class);
        com.firas.opensooq.data.db.model.weather.Weather object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Weather) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$statusId = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$statusId();
            if (realmGet$statusId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.statusIdIndex, rowIndex, realmGet$statusId.longValue(), false);
            }
            String realmGet$main = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$main();
            if (realmGet$main != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
            }
            String realmGet$description = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            }
            String realmGet$icon = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.firas.opensooq.data.db.model.weather.Weather object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Weather.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$statusId = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$statusId();
        if (realmGet$statusId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.statusIdIndex, rowIndex, realmGet$statusId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIdIndex, rowIndex, false);
        }
        String realmGet$main = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$main();
        if (realmGet$main != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mainIndex, rowIndex, false);
        }
        String realmGet$description = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
        }
        String realmGet$icon = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.iconIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.firas.opensooq.data.db.model.weather.Weather.class);
        long tableNativePtr = table.getNativePtr();
        WeatherColumnInfo columnInfo = (WeatherColumnInfo) realm.getSchema().getColumnInfo(com.firas.opensooq.data.db.model.weather.Weather.class);
        com.firas.opensooq.data.db.model.weather.Weather object = null;
        while (objects.hasNext()) {
            object = (com.firas.opensooq.data.db.model.weather.Weather) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$statusId = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$statusId();
            if (realmGet$statusId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.statusIdIndex, rowIndex, realmGet$statusId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIdIndex, rowIndex, false);
            }
            String realmGet$main = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$main();
            if (realmGet$main != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mainIndex, rowIndex, realmGet$main, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mainIndex, rowIndex, false);
            }
            String realmGet$description = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$description();
            if (realmGet$description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.descriptionIndex, rowIndex, realmGet$description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.descriptionIndex, rowIndex, false);
            }
            String realmGet$icon = ((com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconIndex, rowIndex, realmGet$icon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.iconIndex, rowIndex, false);
            }
        }
    }

    public static com.firas.opensooq.data.db.model.weather.Weather createDetachedCopy(com.firas.opensooq.data.db.model.weather.Weather realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.firas.opensooq.data.db.model.weather.Weather unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.firas.opensooq.data.db.model.weather.Weather();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.firas.opensooq.data.db.model.weather.Weather) cachedObject.object;
            }
            unmanagedObject = (com.firas.opensooq.data.db.model.weather.Weather) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface unmanagedCopy = (com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) unmanagedObject;
        com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface realmSource = (com_firas_opensooq_data_db_model_weather_WeatherRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$statusId(realmSource.realmGet$statusId());
        unmanagedCopy.realmSet$main(realmSource.realmGet$main());
        unmanagedCopy.realmSet$description(realmSource.realmGet$description());
        unmanagedCopy.realmSet$icon(realmSource.realmGet$icon());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Weather = proxy[");
        stringBuilder.append("{statusId:");
        stringBuilder.append(realmGet$statusId() != null ? realmGet$statusId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{main:");
        stringBuilder.append(realmGet$main() != null ? realmGet$main() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{description:");
        stringBuilder.append(realmGet$description() != null ? realmGet$description() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{icon:");
        stringBuilder.append(realmGet$icon() != null ? realmGet$icon() : "null");
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
        com_firas_opensooq_data_db_model_weather_WeatherRealmProxy aWeather = (com_firas_opensooq_data_db_model_weather_WeatherRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aWeather.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWeather.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aWeather.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
