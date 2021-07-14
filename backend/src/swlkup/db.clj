(ns swlkup.db)

(def example-db {:usertokens [{:token "T0p53cret"
                               :ngo :seawatch}
                              {:token "R4nd0m"
                               :ngo :lifeline}]
                 :ngos [{:id :lifeline
                         :name "Mission Lifeline"}
                        {:id :seawatch
                         :name "Sea-Watch"}]
                 :supervisors [{:name_full "Max Müller"
                                :photo "https://raw.githubusercontent.com/wiki/community-garden/community-garden.github.io/images/team_avatar_joe.png"
                                :login :todo
                                :email "praxis@max.mueller.de"
                                :languages [:de :en]
                                :offers #{:counselling :counselling_telephone :crisis_intervention}
                                :offers_online true
                                :offers_offline true
                                :contacts {:phone "0351 1234 5678"
                                           :website "https://max.mueller.de"}
                                :location {:zip "01022"
                                           :address_string "Leipziger Str. 13, 01022 Dresden"
                                           :lat 23.42
                                           :lon 52.34
                                           :radius_kilometer 10}
                                :text "irgend etwas über mich ;)"}
                               {:name_full "Maria Musterfrau"
                                :photo "https://raw.githubusercontent.com/wiki/community-garden/community-garden.github.io/images/team_avatar_stephanie.png"
                                :login :todo
                                :email "maria@mm.de"
                                :languages [:de :en :it :es :fr :ar]
                                :offers #{:counselling :counselling_telephone :crisis_intervention
                                          :mediation :moderation :supervision :workshops}
                                :offers_online true
                                :offers_offline true
                                :contacts {:phone "+49 123 4567 8901"
                                           :website "https://mm.de"}
                                :location {:zip "01010"
                                           :address_string "Hauptstr. 7, 01010 Dresden"
                                           :lon 42.23
                                           :lat 13.37
                                           :radius_kilometer 10}
                                :text "todo"
                                :ngos #{:seawatch}}]
                 :languages [{:id :de
                              :name "Deutsch"
                              :flag_url "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/180px-Flag_of_Germany.svg.png"}]
                 :offers [{:id :counselling
                           :target :individual
                           :desc "sessions for individuals (maybe this could also be framed as 'counselling with individuals'"}
                          {:id :counselling_telephone
                           :target :individual}
                          {:id :crisis_intervention
                           :target :individual}

                          {:id :briefing
                           :target :group
                           :desc "psychological briefing & debriefing of crews"}
                          {:id :moderation
                           :target :group}
                          {:id :mediation
                           :target :group}
                          {:id :supervision
                           :target :group}
                          {:id :workshops
                           :target :group}

                          {:id :coaching}
                          {:id :translation}
                         ]})

(def db example-db)
