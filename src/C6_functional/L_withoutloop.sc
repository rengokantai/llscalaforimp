val zone=java.util.TimeZone.getAvailableIDs

zone.map(s=>s.split("/")).filter(_.length>1).map(a=>a(1)).grouped(10).toArray.map(a=>a(0))



