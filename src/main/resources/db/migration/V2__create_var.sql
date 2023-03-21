create table structural_element_frame
(
    id                                int     not null,
    results_id                        int     not null,
    amount_floor                      int     not null,
    floor_number                      int     not null,
    floor_height                      int     not null,
    perimeter_of_external_walls       float   not null,
    base_area                         float   not null,
    external_wall_thickness           float   not null,
    internal_wall_length              int     not null,
    internal_wall_thickness           int     not null,
    OSB_external_wall                 varchar not null,
    steam_waterproofing_external_wall varchar not null,
    windscreen_external_wall          varchar not null,
    insulation_external_wall          varchar not null,
    overlap_thickness                 varchar not null,
    OSB_thickness                     varchar not null,
    steam_waterproofing_thickness     varchar not null,
    windscreen_thickness              varchar not null,
    insulation_thickness              varchar not null,
    OSB_internal_wal                  varchar not null,
    UNIQUE (id),
    PRIMARY KEY (id)
);
create table structural_element_basement
(
    id                          int     not null,
    results_id                  int     not null,
    perimeter_of_external_walls float   not null,
    internal_wall_length        float   not null,
    concrete_piles              varchar not null,
    concrete                    varchar not null,
    unique (id),
    primary key (id)
);
create table materials
(
    id                          int     not null,
    "name"                        varchar not null,
    material_type               varchar,
    structural_element_type     varchar,
    unique (id),
    primary key (id)
);
create table measurement_units
(
    id                     int      not null,
    measurement_units_name varchar not null,
    unique (id),
    primary key (id)
);
create table material_characteristics
(
    id                  int     not null,
    "name"              varchar not null,
    measurement_unit_id int     not null,
    materials_id        int     not null,
    "length"            float,
    width               float,
    thickness           float,
    volume              float,
    unique (id, measurement_unit_id, materials_id),
    primary key (id)
);
create table calculation
(
    id                           int     not null,
    manager_id                   bigint  not null,
    address_object_constructions varchar not null,
    number                       bigint  not null,
    created_date                 date    not null,
    results_id                   bigint  not null,
    calculation_state_id         bigint  not null,
    unique (id),
    primary key (id)
);
create table results
(
    id                          int    not null,
    material_characteristics_id bigint not null,
    material                    varchar,
    amount                      int,
    price                       float,
    measurement_unit            varchar,
    full_price                  float,
    unique (id),
    primary key (id)
);
create table openings_in_a_structural_element_frame
(
    id                          int    not null,
    structural_element_frame_id bigint not null,
    openings_id                 bigint not null,
    amount                      int,
    unique (id),
    primary key (id)
);
create table openings
(
    id     int     not null,
    "type" varchar not null,
    width  float   not null,
    height float   not null,
    unique (id),
    primary key (id)
);
create table users
(
    id          int     not null,
    customer_id bigint  not null,
    last_name   varchar not null,
    first_name  varchar not null,
    second_name varchar not null,
    phone       bigint  not null,
    email       varchar not null,
    "password"  varchar not null,
    "login"     varchar not null,
    state_id    bigint  not null,
    unique (id),
    primary key (id)
);
create table customers
(
    id          int     not null,
    last_name   varchar not null,
    first_name  varchar not null,
    second_name varchar,
    phone       bigint,
    email       varchar,
    address     varchar,
    unique (id),
    primary key (id)
);
create table users_group
(
    id    int     not null,
    title varchar not null,
    unique (id),
    primary key (id)
);
create table users_users_group
(
    users_id      int not null,
    users_group_id int not null,
    unique (users_id, users_group_id),
    primary key (users_id)
);
create table price_lists
(
    id                          int   not null,
    material_characteristics_id int   not null,
    "date"                      date  not null,
    purchase_price              float not null,
    selling_price               float not null,
    unique (id, material_characteristics_id),
    primary key (id)
);
create table user_status
(
    id     int     not null,
    "name" varchar not null,
    unique (id),
    primary key (id)
);
create table calculation_status
(
    id     int     not null,
    "name" varchar not null,
    unique (id),
    primary key (id)
);
alter table users_users_group add foreign key (users_id) references users(id);
alter table users_users_group add foreign key (users_group_id) references users_group(id);
alter table users add foreign key (state_id) references user_status(id);
alter table users add foreign key (customer_id) references customers(id);
alter table calculation add foreign key (manager_id) references customers(id);
alter table calculation add foreign key (results_id) references results(id);
alter table calculation add foreign key (calculation_state_id) references calculation_status(id);
alter table results add foreign key (material_characteristics_id) references material_characteristics(id);
alter table structural_element_basement add foreign key (results_id) references results(id);
alter table structural_element_frame add foreign key (results_id) references results(id);
alter table openings_in_a_structural_element_frame add foreign key (structural_element_frame_id) references structural_element_frame(id);
alter table openings_in_a_structural_element_frame add foreign key (openings_id) references openings(id);
alter table material_characteristics add foreign key (materials_id) references materials(id);
alter table material_characteristics add foreign key (measurement_unit_id) references measurement_units(id);
alter table price_lists add foreign key (material_characteristics_id) references material_characteristics(id);



