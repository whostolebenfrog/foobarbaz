(defproject com.wsbfg/foobarbaz "1.0.3"
  :description "Very little"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.1"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ring-jetty-component "0.3.1" :exclusions [ring/ring-core]]
                 [org.slf4j/slf4j-log4j12 "1.7.21"]
                 [metosin/compojure-api "1.1.8"]]
  :main com.wsbfg.foobarbaz.system.bootstrap
  :profiles {:dev
             {:source-paths ["dev"]
              :dependencies [[midje "1.8.3" :exclusions [potemkin clj-time]]]
              :plugins      [[jonase/eastwood "0.2.1"]
                             [lein-cloverage "1.0.6"]
                             [lein-midje "3.1.3"]
                             [lein-set-version "0.4.1"]
                             [lein-metajar "0.1.1"]
                             [lein-ancient "0.6.8" :exclusions [org.clojure/clojure]]]
              :eastwood     {:namespaces      [:source-paths]
                             :exclude-linters []}}})
