(defproject org.clojars.prozion/odysseus-chemistry "0.0.1"
  :description "A library with useful functions for calculations in chemistry"
  :url "https://github.com/prozion/odysseus-chemistry"
  :license {:name "MIT License"
            :url  "https://github.com/aws/mit-0"}
  :dependencies [
                [org.clojars.prozion/odysseus "0.1.7"]
                [org.clojars.prozion/tabtree "0.6.8"]
                ]
  :plugins [
            ; [lein-ancient "0.6.15"]
            ]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]]}}
  :deploy-repositories [["releases"
                            {
                              :url  "https://repo.clojars.org"
                              :creds :gpg
                             }]]
  :release-tasks [
                  ["deploy"]
                  ]
  :repl-options {
    :init-ns org.clojars.prozion.odysseus-chemistry.moles
  }
)
