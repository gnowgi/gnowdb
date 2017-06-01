(ns gnowdb.core
  (:gen-class)
  (:require [gnowdb.neo4j.gneo :as gneo]
            [gnowdb.neo4j.gdriver :as gdriver]))

(defn reload-all
  "Reload All"
  []
  (use 'gnowdb.core :reload-all))

(defn -main
  ""
  [& args])
