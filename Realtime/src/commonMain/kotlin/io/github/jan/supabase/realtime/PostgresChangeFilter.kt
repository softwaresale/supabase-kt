package io.github.jan.supabase.realtime

class PostgresChangeFilter(private val event: String, private val schema: String) {

    /**
     * The table name that should be monitored
     */
    var table: String? = null

    /**
     * Filter the received changes in your table.
     * E.g.: "user_id=eq.1"
     */
    var filter: String? = null

    fun buildConfig() = PostgresJoinConfig(schema, table, filter, event)

}