-- Workspaces
INSERT INTO workspace (id, name) VALUES (1, 'Marketing'), (2, 'Finance');

-- Users
INSERT INTO user (id, name, email, role) VALUES
(1, 'Alice', 'alice@example.com', 'ADMIN'),
(2, 'Bob', 'bob@example.com', 'USER'),
(3, 'Charlie', 'charlie@example.com', 'SUPERUSER');

-- User-Workspace mappings
INSERT INTO user_workspaces (user_id, workspaces_id) VALUES
(1, 1), (1, 2), (2, 1), (3, 2);

-- Domains
INSERT INTO domain (id, name, workspace_id) VALUES
(1, 'Campaigns', 1),
(2, 'Budgeting', 2);

-- SubDomains
INSERT INTO sub_domain (id, name, domain_id) VALUES
(1, 'Email Campaigns', 1),
(2, 'Forecasting', 2);

-- Data Products
INSERT INTO data_product (id, name, description, technical_details, owner, domain_id, sub_domain_id) VALUES
(1, 'Campaign Dashboard', 'Tracks CTR and conversions', 'Redshift + Tableau', 'Charlie', 1, 1),
(2, 'Revenue Predictor', 'Predicts quarterly revenue', 'Python + Prophet', 'Alice', 2, 2);

-- DataProduct-Workspace mappings
INSERT INTO data_product_workspaces (data_product_id, workspaces_id) VALUES
(1, 1),
(2, 2);

-- Comments
INSERT INTO comment (id, text, timestamp, user_id, data_product_id) VALUES
(1, 'Great dashboard!', CURRENT_TIMESTAMP, 2, 1),
(2, 'Can we add mobile split?', CURRENT_TIMESTAMP, 3, 1);
