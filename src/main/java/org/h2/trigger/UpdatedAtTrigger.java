package org.h2.trigger;

import java.sql.*;  
import java.time.Instant;
import org.h2.tools.TriggerAdapter;

public class UpdatedAtTrigger extends TriggerAdapter {

  @Override
  public void fire(Connection conn, ResultSet oldRow, ResultSet newRow) throws SQLException {
    newRow.updateTimestamp("modification_datetime", Timestamp.from(Instant.now()));
  }
}