(defproject swlkup-backend "0.1.0-SNAPSHOT"
  :description "supervisor lookup backend"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [ajk/specialist-server "0.6.0"]
                 [compojure "1.6.2"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.8.2"]
                 [ring/ring-devel "1.9.4"]
                 [ring-cors "0.1.13"]
                 [ring/ring-json "0.5.1"]
                 [ring-webjars "0.2.0"]
                 [org.webjars/graphiql "0.11.11"]]
  :main swlkup.handler
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring/ring-mock "0.4.0"]
                                  ;; additional deps to run `lein test` 
                                  [nrepl/nrepl "0.8.3"]
                                  [clojure-complete/clojure-complete "0.2.5"]]}})
